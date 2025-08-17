package br.com.alura.codechella.application.usecases;

import br.com.alura.codechella.application.gateways.RepositorioDeUsuario;
import br.com.alura.codechella.domain.entities.usuario.Usuario;

public class ExcluirUsuario {
    public final RepositorioDeUsuario repositorio;

    public ExcluirUsuario(RepositorioDeUsuario repositorio) {
        this.repositorio = repositorio;
    }

    public void deletarUsuario(String cpf) {
        repositorio.deletarUsuario(cpf);
    }
}
