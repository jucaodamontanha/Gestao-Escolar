package com.example.GestaoEscolar.DTO;

public record CadastroDto(String nomeCompleto, Long ra, String endereco, String bairro,
                          Long cep, Long telefone, String nomeMaeCompleto, String nomePaiCompleto,
                          String usuario, String senha) {
}
