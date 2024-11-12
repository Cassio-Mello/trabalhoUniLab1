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

    //Método para inserir lojas
    public boolean insereLoja(Loja loja){
        for (int i = 0; i < lojas.length; i++){
            if (lojas[i] == null){
                lojas[i] = loja;
                return true;            
            }
        }
        return false;
    }
    

    //Método para remover lojas
    public boolean removeLoja(String nome){
        for (int i = 0; i < lojas.length; i++){
            if (lojas[i] != null && lojas[i].getNome().equals(nome)){
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    //Método lojas por tipo
    public int quantidadeLojasPorTipo(String tipoLoja){
        int contador =0;

        for (Loja loja : lojas){
            if (tipoLoja.equalsIgnoreCase("Alimentação") && loja instanceof Alimentacao){
                contador++;
            }else if (tipoLoja.equalsIgnoreCase("Bijuteria") && loja instanceof Bijuteria){
                contador++;
            }else if (tipoLoja.equalsIgnoreCase("Cosmético") && loja instanceof Cosmetico){
                contador++;
            }else if (tipoLoja.equalsIgnoreCase("Informática") && loja instanceof Informatica){
                contador++;
            }else if (tipoLoja.equalsIgnoreCase("Vestuário") && loja instanceof Vestuario){
                contador++;
            }  
            
        }
        if (contador == 0){
            return -1;
        }

        return contador;
    }

    //Método para encontrar a loja com o seguro mais caro
    public Informatica lojaSeguroMaisCaro(){
        Informatica lojaMaisCaro = null;
        double maiorSeguro = 0;

        for (Loja loja : lojas){
            if (loja instanceof Informatica){
                Informatica lojaInformatica = (Informatica) loja;
                if (lojaInformatica.getSeguroEletronicos() > maiorSeguro){
                    maiorSeguro = lojaInformatica.getSeguroEletronicos();
                    lojaMaisCaro = lojaInformatica;
                }
            }
        }
        return lojaMaisCaro;
    }
    

}
