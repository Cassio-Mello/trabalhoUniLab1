package br.com.cassioMello.clases;

public class Vestuario extends Loja{
    private boolean produtosImportados;

    //construtor principal com informaçãp de salario base
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
    Endereco endereco, Data dataFundacao, boolean produtosImportados, int quantidadeMaximaProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco,
        dataFundacao, quantidadeMaximaProdutos);
        this.produtosImportados = produtosImportados;
    }

    //construto de sobrecarga sem informação de salario base
    public Vestuario(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao,
    boolean produtosImportados, int quantidadeMaximaProdutos) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.produtosImportados = produtosImportados;
    }

    //Getters and Setters
    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    //Método toString
    @Override
    public String toString(){
        return super.toString() + "\n" + tipoProduto();
    }

    //Método que verifica se o produto é importado ou não e retorna uma string conforme condição
    public String tipoProduto(){
        if (produtosImportados == true){
            return "Produto Importado";

        }else{
            return "Produto Nacional";
        }
    }
}
