package br.com.alura.codechella.application.usecases;

import br.com.alura.codechella.application.gateways.RepositorioDeUsuario;
import br.com.alura.codechella.domain.entities.usuario.Usuario;

public class AtualizarUsuario {
    private final RepositorioDeUsuario repositorio;

    public AtualizarUsuario(RepositorioDeUsuario repositorio) {
        this.repositorio = repositorio;
    }

    public Usuario editarUsuario(String cpf, Usuario usuario) {
        return repositorio.editarUsuario(cpf, usuario);
    }

}
