package com.example.dieta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dieta.usuario.Usuario;

public interface UsuarioRepository  extends JpaRepository <Usuario, Long> {
    
}
