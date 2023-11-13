package br.com.pyetro.service;

public class TesteCliente {
    public String nome;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void adicionarNome(String nome){
        setNome(nome);
    }
    public void adicionarNome1(String nome){
        setNome(nome);
    }
}
