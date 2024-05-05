package com.example.GestaoEscolar.repository;

import com.example.GestaoEscolar.models.CadastroModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CadastroRepository extends JpaRepository <CadastroModel, UUID>{
    
}
