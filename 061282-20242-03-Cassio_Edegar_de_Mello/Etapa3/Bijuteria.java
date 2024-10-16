package br.com.cassioMello.clases;

public class Bijuteria extends Loja{
    private double metaVendas;

    //construtor principal com informaçãp de salario base
    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, double metaVendas) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.metaVendas = metaVendas;
    }

    //construto de sobrecarga sem informação de salario base
    public Bijuteria(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, double metaVendas) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao);
        this.metaVendas = metaVendas;
    }

    //Getters and Setters
    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    //Método toString
    @Override
    public String toString(){
        return super.toString() + "\nMeta de vendas: " + "R$" + getMetaVendas();
    }
}
