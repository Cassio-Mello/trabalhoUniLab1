package br.com.cassioMello.clases;

public class Alimentacao extends Loja{
    private Data dataAlvara;

    //construtor principal com informaçãp de salario base
    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, Data dataAlvara, int quantidadeMaximaProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.dataAlvara = dataAlvara;
    }
    //construto de sobrecarga sem informação de salario base
    public Alimentacao(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao,
            Data dataAlvara, int quantidadeMaximaProdutos) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.dataAlvara = dataAlvara;
    }

    //Getters and Setters
    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    //método toString
    @Override
    public String toString(){
        return super.toString() + "\nData Alvará: " + getDataAlvara();
    }
}
