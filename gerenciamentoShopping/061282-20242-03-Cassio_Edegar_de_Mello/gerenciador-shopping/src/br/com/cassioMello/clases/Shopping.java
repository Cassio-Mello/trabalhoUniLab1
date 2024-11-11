package br.com.cassioMello.clases;

public class Shopping {
    //Atributos
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    //Construtor
    public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaximaLojas];
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Loja[] getLojas() {
        return lojas;
    }
    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    @Override
    public String toString(){
        return "Nome Shopping: " + getNome() + "\n" +
        endereco.toString();
        
    }

    
    
}
