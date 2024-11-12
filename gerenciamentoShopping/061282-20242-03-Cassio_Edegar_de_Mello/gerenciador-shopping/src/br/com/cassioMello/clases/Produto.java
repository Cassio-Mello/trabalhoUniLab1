package br.com.cassioMello.clases;

public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    //Contrutor
    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
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

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataDeValidade) {
        this.dataValidade = dataDeValidade;
    }
    

    //sobrescrevendo toString
    @Override
    public String toString(){
        return "Produto: " + getNome() + "   Preço: " + String.format("R$%.2f", getPreco())
                + "\nData de válidade: " + dataValidade.toString(); 
    }

    //método para verificar validade
    public boolean estaVencido(Data data){
        
        if (dataValidade.getAno() < data.getAno()) {
            return true;
        } else if (dataValidade.getAno() == data.getAno()) {
            if (dataValidade.getMes() < data.getMes()) {
                return true;
            } else if (dataValidade.getMes() == data.getMes() && dataValidade.getDia() < data.getDia()) {
                return true;
            }
        }
        return false;
    }

    


    
}
