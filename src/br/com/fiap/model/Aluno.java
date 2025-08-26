package br.com.fiap.model;

public class Aluno {

    private int rm;

    private String nome;

    private Endereco endereco;

    public Aluno(int rm, String nome, Endereco endereco) {
        this.rm = rm;
        this.nome = nome;
        this.endereco = endereco;
    }

    public Aluno() {
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}