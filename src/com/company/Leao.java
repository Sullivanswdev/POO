package com.company;

import java.util.ArrayList;

public class Leao {

    private String nome;
    private int idade;

    public Leao(String nome, int idade) {
       this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void mostrar(){
        System.out.println("O nome do leão é: " + this.nome);
    }

}

