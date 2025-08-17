package br.com.alura.codechella.domain.entities.usuario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UsuarioTest {

    @Test
    public void naoDeveCadastrarUsuarioComCpfNoFormatoInvalido() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Usuario("12345678999", "Jacque", LocalDate.parse("1990-09-08"), "email@email.com"));
    }

    @Test
    public void nomeNaoDeveEstarEmBranco() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Usuario("123.456.789-99", "", LocalDate.parse("1990-09-08"), "email@email.com"));
    }

    @Test
    public void nascimentoNaoDeveEstarNoFuturo() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Usuario("123.456.789-99", "Raul", LocalDate.parse("2025-08-20"), "email@email.com"));
    }

    @Test
    public void emailNaoDeveEstarNoFormatoInvalido() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Usuario("123.456.789-99", "Raul", LocalDate.parse("1990-08-20"), "emailemail.com"));
    }

    @Test
    public void deveCriarUsuarioComFabrica() {
        UsuarioBuilder fabrica = new UsuarioBuilder();
        Usuario usuario = fabrica.comNomeCpfNascimento("Raul", "123.456.789-00",
                LocalDate.parse("2010-11-05"));

        Assertions.assertEquals("Raul", usuario.getNome());

        usuario = fabrica.incluiEndereco("12345-999", 40, "ap 05");

        Assertions.assertEquals("ap 05", usuario.getEndereco().getComplemento());
    }

}
