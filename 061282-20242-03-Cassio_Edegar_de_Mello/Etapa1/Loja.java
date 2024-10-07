package br.com.cassioMello.clases;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;

    //Contrutor com todos os atributos
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    //construtor alternativo que recebe apenas nome e quantidade de funcionarios e adiciona -1 ao salario
    public Loja(String nome, int quantidadeFuncionarios){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        salarioBaseFuncionario = -1;
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

    //Método toString
    @Override
    public String toString(){
        return "\nNome da loja: " + getNome() + "\nNúmero de funcionários: " + getQuantidadeFuncionarios() + "\nSalário base: " + String.format("R$%.2f", getSalarioBaseFuncionario());
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
