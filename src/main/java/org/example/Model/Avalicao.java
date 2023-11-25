package org.example.Model;

public class Avalicao {
    private long Nota;
    private long ID_Avaliacao;

    @Override
    public String toString() {
        return "Avalicao{" +
                "Nota=" + Nota +
                ", ID_Avaliacao=" + ID_Avaliacao +
                '}';
    }

    public long getNota() {
        return Nota;
    }

    public void setNota(long nota) {
        Nota = nota;
    }

    public long getID_Avaliacao() {
        return ID_Avaliacao;
    }

    public void setID_Avaliacao(long ID_Avaliacao) {
        this.ID_Avaliacao = ID_Avaliacao;
    }
}
