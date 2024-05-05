package com.example.GestaoEscolar.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tb_cadastro")
public class CadastroModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nomeCompleto;
    private Integer ra;
    private String endereco;
    private String bairro;
    private Integer cep;
    private Integer telefone;
    private String nomeMaeCompleto;
    private String nomePaiCompleto;
    private String usuario;
    private String senha;
}
