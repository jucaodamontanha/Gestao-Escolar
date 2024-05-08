package com.example.GestaoEscolar.controller;

import com.example.GestaoEscolar.DTO.CadastroDto;
import com.example.GestaoEscolar.models.CadastroModel;
import com.example.GestaoEscolar.repository.CadastroRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CadastroController {

    @Autowired
    CadastroRepository cadastroRepository;

    @PostMapping("/cadastro")
    public ResponseEntity<CadastroModel> saveCadastro(@RequestBody CadastroDto cadastroDto){
        var cadastroModel = new CadastroModel();
        BeanUtils.copyProperties(cadastroDto, cadastroModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(cadastroRepository.save(cadastroModel));
    }
    @GetMapping("/cadastro")
    public ResponseEntity<List<CadastroModel>> getAllCadastro(){
        return ResponseEntity.status(HttpStatus.OK).body(cadastroRepository.findAll());
    }

}
