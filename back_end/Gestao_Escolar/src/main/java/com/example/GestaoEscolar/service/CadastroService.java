package com.example.GestaoEscolar.service;

import com.example.GestaoEscolar.models.CadastroModel;
import com.example.GestaoEscolar.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroService {
    @Autowired
    private CadastroRepository cadastroRepository;

    public void cadastro(CadastroModel cadastroModel){
        CadastroModel cadastro = new CadastroModel();
        cadastro.setNomeCompleto(cadastro.getNomeMaeCompleto());
        cadastro.setRa(cadastro.getRa());
        cadastro.setNomeMaeCompleto(cadastro.getNomeMaeCompleto());
        cadastro.setNomePaiCompleto(cadastro.getNomePaiCompleto());
        cadastro.setEndereco(cadastro.getEndereco());
        cadastro.setBairro(cadastro.getBairro());
        cadastro.setCep(cadastro.getCep());
        cadastro.setTelefone(cadastro.getTelefone());
        cadastro.setUsuario(cadastro.getUsuario());
        cadastro.setSenha(cadastro.getSenha());

    }
}
