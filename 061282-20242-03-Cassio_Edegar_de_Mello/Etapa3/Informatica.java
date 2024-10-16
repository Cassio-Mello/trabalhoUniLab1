package br.com.cassioMello.clases;

public class Informatica extends Loja{
    private double seguroEletronicos;

    //construtor principal com informaçãp de salario base
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.seguroEletronicos = seguroEletronicos;
    }

    //construto de sobrecarga sem informação de slario base
    public Informatica(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao,
            double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao);
        this.seguroEletronicos = seguroEletronicos;
    }

    //Getters and Setters
    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    //método to string
    @Override
    public String toString(){
        return super.toString() + "Valor seguro: R$" + getSeguroEletronicos();
    }
}
