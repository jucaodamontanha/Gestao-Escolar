package com.example.GestaoEscolar.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tb_cadastro")
public class CadastroModel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @NotBlank
    private String nomeCompleto;
    @NonNull
    @Column(unique = true)
    private Long ra;
    @NotBlank
    private String endereco;
    @NotBlank
    private String bairro;
    @NotNull
    private Long cep;
    @NotNull
    private Long telefone;
    @NotBlank
    private String nomeMaeCompleto;
    @NotBlank
    private String nomePaiCompleto;
    @NotBlank
    @Column(unique = true)
    private String usuario;
    @NotBlank
    @Length(min = 8)
    private String senha;
}
