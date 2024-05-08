package com.example.GestaoEscolar.repository;

import com.example.GestaoEscolar.models.CadastroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface CadastroRepository extends JpaRepository <CadastroModel, UUID>{

}
