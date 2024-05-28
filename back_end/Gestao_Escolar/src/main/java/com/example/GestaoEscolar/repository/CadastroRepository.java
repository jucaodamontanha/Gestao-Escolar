package com.example.GestaoEscolar.repository;

import com.example.GestaoEscolar.models.CadastroModel;
import com.example.GestaoEscolar.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;
@Repository
public interface CadastroRepository extends JpaRepository <UsuarioModel, UUID>{

    Optional<UsuarioModel> findByUsuario(String usuario);

}
