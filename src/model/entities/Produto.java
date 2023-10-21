package model.entities;

//region IMPORTS

import model.exception.DomainException;

//endregion


public class Produto {

    //region ATRIBUTOS

    private String nome;
    private  Double valor;

    //endregion

    //region CONSTRUTORES

    public Produto(){

    }


    public Produto(String nome, Double valor) {
        // Programação defensiva
        // Tratando possiveis exceções no construtor
        if(valor < 0){
            throw new DomainException("Error: O valor do produto é invalido!");
        }

        this.nome = nome;
        this.valor = valor;
    }
    //endregion

    //region GETTERS AND SETTERS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }


    //endregion
}
