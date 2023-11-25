package org.example.Model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private long ID_Usuario;
    private String Senha;
    private String Nome;
    private Integer Idade;
    private SEXO sexo;
    private List<Livro> Livro_Favorito = new ArrayList<>();
    private String E_mail;
    private Boolean administrador;
    private String Login;

    public Usuario(long ID_Usuario, String senha, String nome,
                   Integer idade, SEXO sexo, List<Livro> livro_Favorito,
                   String e_mail, Boolean administrador, String login) {
        this.ID_Usuario = ID_Usuario;
        Senha = senha;
        Nome = nome;
        Idade = idade;
        this.sexo = sexo;
        Livro_Favorito = livro_Favorito;
        E_mail = e_mail;
        this.administrador = administrador;
        Login = login;
    }

    public long getID_Usuario() {
        return ID_Usuario;
    }

    public void setID_Usuario(long ID_Usuario) {
        this.ID_Usuario = ID_Usuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Integer getIdade() {
        return Idade;
    }

    public void setIdade(Integer idade) {
        Idade = idade;
    }

    public SEXO getSexo() {
        return sexo;
    }

    public void setSexo(SEXO sexo) {
        this.sexo = sexo;
    }

    public List<Livro> getLivro_Favorito() {
        return Livro_Favorito;
    }

    public void setLivro_Favorito(List<Livro> livro_Favorito) {
        Livro_Favorito = livro_Favorito;
    }

    public String getE_mail() {
        return E_mail;
    }

    public void setE_mail(String e_mail) {
        E_mail = e_mail;
    }

    public Boolean getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Boolean administrador) {
        this.administrador = administrador;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "ID_Usuario=" + ID_Usuario +
                ", Senha='" + Senha + '\'' +
                ", Nome='" + Nome + '\'' +
                ", Idade=" + Idade +
                ", sexo=" + sexo +
                ", Livro_Favorito=" + Livro_Favorito +
                ", E_mail='" + E_mail + '\'' +
                ", administrador=" + administrador +
                ", Login='" + Login + '\'' +
                '}';
    }
}
