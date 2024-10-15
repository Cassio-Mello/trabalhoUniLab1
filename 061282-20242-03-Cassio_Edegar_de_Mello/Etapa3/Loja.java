package br.com.cassioMello.clases;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;

    //Contrutor com todos os atributos
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }

    //construtor alternativo que recebe apenas nome e quantidade de funcionarios e adiciona -1 ao salario
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao ){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }

    //Métodos Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataDeFundacao) {
        this.dataFundacao = dataDeFundacao;
    }


    //Método toString
    @Override
    public String toString(){
        return "\nNome da loja: " + getNome() 
                + "\nNúmero de funcionários: " + getQuantidadeFuncionarios() 
                + "\nSalário base: " + String.format("R$%.2f", getSalarioBaseFuncionario())
                + "\nData de fundação: " + dataFundacao.toString() 
                + endereco.toString();
    }

    //Método que calcula gastos com slário
    public double gastosComSalario(){
        if (getSalarioBaseFuncionario() > -1){
            return getSalarioBaseFuncionario() * getQuantidadeFuncionarios();
        }else{
            return -1; // -1 siginifica que o salário nao foi definido
        }
    }

    //Método para retornar o tamanho da loja
    public char tamanhoDaLoja(){
        if (getQuantidadeFuncionarios() >= 31){
            return 'G'; //Grande
        }else if (getQuantidadeFuncionarios() >= 10){
            return 'M'; //Médio
        }else{
            return 'P'; //Pequeno
        }

    }


}
