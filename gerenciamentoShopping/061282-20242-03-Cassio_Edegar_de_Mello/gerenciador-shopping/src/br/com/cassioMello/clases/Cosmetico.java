package br.com.cassioMello.clases;

public class Cosmetico extends Loja {
    double taxaComercializacao;

    //construtor principal com informaçãp de salario base
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
    Endereco endereco, Data dataFundacao, double taxaComercializacao, int quantidadeMaximaProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco,
        dataFundacao, quantidadeMaximaProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }

    //construto de sobrecarga sem informação de salario base
    public Cosmetico(String nome, int quantidadeFuncionarios, Endereco endereco,
    Data dataFundacao,double taxaComercializacao, int quantidadeMaximaProdutos) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }

    //Getters and Setters
    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    //método toString
    @Override
    public String toString() {
        return super.toString() + "\nTaxa de comercialização" + taxaComercializacao;
    }

    
    
    

        

    

    
}
