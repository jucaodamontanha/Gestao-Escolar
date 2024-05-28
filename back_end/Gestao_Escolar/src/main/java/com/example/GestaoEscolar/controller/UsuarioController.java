package com.example.GestaoEscolar.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    public ResponseEntity<String>getUsuario(){
        return ResponseEntity.ok("Sucesso!");
    }
}
