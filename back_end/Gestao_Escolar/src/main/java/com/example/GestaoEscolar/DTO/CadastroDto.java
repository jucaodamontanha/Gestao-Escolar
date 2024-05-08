package com.example.GestaoEscolar.DTO;

public record CadastroDto(String nomeCompleto, Integer ra, String endereco, String bairro,
                          Integer cep, Integer telefone, String nomeMaeCompleto, String nomePaiCompleto,
                          String usuario, String senha) {
}
