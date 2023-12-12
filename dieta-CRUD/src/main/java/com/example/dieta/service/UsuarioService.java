package com.example.dieta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dieta.repository.UsuarioRepository;
import com.example.dieta.usuario.Usuario;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    private UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario salvarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);

    }

    public List<Usuario>listarUsuarios() {
        return usuarioRepository.findAll();
    }
}
