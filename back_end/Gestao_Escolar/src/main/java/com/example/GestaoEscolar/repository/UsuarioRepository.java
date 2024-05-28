package com.example.GestaoEscolar.repository;

import com.example.GestaoEscolar.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, UUID> {

    Optional<UsuarioModel> findByUsuario(String usuario);
}
