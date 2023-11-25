package org.example.Service;

import org.example.Model.Livro;
import org.example.Model.SEXO;
import org.example.Model.Usuario;

import java.util.List;

public class CadastrarNovoUsuario {

    public Usuario cadastrarNovoUsuario(Usuario usuario, long ID_Usuario, String senha, String nome, Integer idade, SEXO sexo, List<Livro> livro_Favorito, String e_mail, Boolean administrador, String login) {

        if (usuario.getAdministrador() == true) {

            Usuario novoUsuario = new Usuario(ID_Usuario, senha, nome, idade, sexo, livro_Favorito, e_mail, administrador, login);
            return novoUsuario;
        }

        return null;


    }
}
