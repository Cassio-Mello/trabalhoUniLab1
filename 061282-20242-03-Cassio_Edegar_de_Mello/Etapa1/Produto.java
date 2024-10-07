package br.com.cassioMello.clases;

public class Produto {
    private String nome;
    private double preco;

    //Contrutor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //Getter and Setters
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getPreco() {
        return preco;
    }


    public void setPreco(double preco) {
        this.preco = preco;
    }

    //sobrescrevendo toString
    @Override
    public String toString(){
        return "\nProduto: " + getNome() + " Preço: " + String.format("R$%.2f", getPreco()); 
    }
    
}
