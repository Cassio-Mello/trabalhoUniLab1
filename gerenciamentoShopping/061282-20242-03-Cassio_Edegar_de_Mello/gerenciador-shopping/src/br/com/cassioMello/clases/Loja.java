package br.com.cassioMello.clases;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;

    //Contrutor com todos os atributos
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
    }

    //construtor alternativo que recebe apenas nome e quantidade de funcionarios e adiciona -1 ao salario
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
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

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
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

    //Método para listar array
    public void imprimeProdutos(){
        for (int i = 0; i < estoqueProdutos.length; i++){
            System.out.println(i + "." + estoqueProdutos);
        }
    }

    //Método para inserir produtos
    public boolean insereProduto(Produto produto){
        for (int i = 0; i < estoqueProdutos.length; i++){
            if (estoqueProdutos[i] == null){
                estoqueProdutos[i] = produto;
                return true;
            }
        }
        return false;
    }
    
    //Método para remover produto
    public boolean removeProduto(String nome){
        for (int i = 0; i < estoqueProdutos.length; i++){
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nome)){
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }




}
