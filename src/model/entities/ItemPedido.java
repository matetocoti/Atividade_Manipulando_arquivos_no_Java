package model.entities;

//region IMPORTS

import model.exception.DomainException;

//endregion



public class ItemPedido {


    //region ATRIBUTOS
    private Integer quantidade;
    private Double preco;
    private Produto produto;

    //endregion

    //region CONSTRUTORES

    public ItemPedido(){

    }

    public ItemPedido(Integer quantidade, Double preco, Produto produto) {
        // Programação defensiva
        // Tratando possiveis exceções no construtor
        if(quantidade <= 0){
            throw new DomainException("Error: O valor da quantidade de produtos é invalido");
        }
        if(preco < 0){
            throw new DomainException("Error: O valor do preço do produto é invalido!");
        }
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }

    //endregion

    //region GETTERS AND SETTERS

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Produto getProduto() {
        return produto;
    }


    //endregion

    //region MÉTODOS

    //Meu método para calcular o subtotal
    public Double subtotal(){
        return preco * quantidade;
    }

    //endregion
}
