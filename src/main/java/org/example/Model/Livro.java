package org.example.Model;

import java.time.LocalDate;

public class Livro {
    private double ID_Livro;

    @Override
    public String toString() {
        return "Livro{" +
                "ID_Livro=" + ID_Livro +
                ", Titulo='" + Titulo + '\'' +
                ", Ano_De_Publicacao=" + Ano_De_Publicacao +
                ", Autor='" + Autor + '\'' +
                ", genero=" + genero +
                ", avalicao=" + avalicao +
                '}';
    }

    public double getID_Livro() {
        return ID_Livro;
    }

    public void setID_Livro(double ID_Livro) {
        this.ID_Livro = ID_Livro;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public LocalDate getAno_De_Publicacao() {
        return Ano_De_Publicacao;
    }

    public void setAno_De_Publicacao(LocalDate ano_De_Publicacao) {
        Ano_De_Publicacao = ano_De_Publicacao;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public SEXO getGenero() {
        return genero;
    }

    public void setGenero(SEXO genero) {
        this.genero = genero;
    }

    public Avalicao getAvalicao() {
        return avalicao;
    }

    public void setAvalicao(Avalicao avalicao) {
        this.avalicao = avalicao;
    }

    private String Titulo;
    private LocalDate Ano_De_Publicacao;
    private String Autor;
    private SEXO genero;
    private Avalicao avalicao;

}
