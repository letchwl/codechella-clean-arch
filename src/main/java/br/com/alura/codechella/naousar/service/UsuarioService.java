package br.com.alura.codechella.naousar.service;

import br.com.alura.codechella.naousar.model.Usuario;

import java.util.List;

public interface UsuarioService {
    Usuario cadastrarUsuario(Usuario usuario);

    List<Usuario> listarTodos();
}
