package br.com.cassioMello.clases;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    //Contrutor
    public Data(int dia, int mes, int ano) {
        this.ano = ano;
        
        //fazendo verificaçao se dia e mes digitados sao validos e também se o ano é bissexto
        if (verificarData(dia, mes, ano) == true){
            this.dia = dia;
            this.mes = mes;
        }else{
            System.out.println("DATA INVÁLIDA");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2020;
        }
    }

    //getters and setter con ferificaça de dia e mes e ano bissexto
    public int getDia() {
        return dia;
    }


    public void setDia(int dia) {
        if (verificarData(dia, mes, ano)){
            this.dia = dia;
        }else{
            System.out.println("Dia informado é inválido");
        }
        
    }


    public int getMes() {
        return mes;
    }


    public void setMes(int mes) {
        if (verificarData(dia, mes, ano)){
            this.mes = mes;
        }else{
            System.out.println("Mês informado é inválido");
        }
    }


    public int getAno() {
        return ano;
    }


    public void setAno(int ano) {
        this.ano = ano;
    }

    //verifica se ano é bissextp
    public boolean verificaAnoBissexto(){
        if ((getAno() % 4 == 0 && getAno() % 100 != 0)|| getAno() % 400 == 0){
            return true;
        }else{
            return false;
        }
    }

    private boolean verificarData(int dia, int mes, int ano){

        //verifica se o mês é válido
        if (mes < 1 || mes > 12){
            return false;
        }

        //variavel qtd dias do mês       j   f  m   a   m   j   j   a   s   o   n   d  
        int quantidadeDiasNoMes[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                                    //   1   2   3   4   5   6   7   8   9  10  11  12

       //verifica se o ano é bissexto e altera a quantidade de dias de fevereiro para 29
       
       //verificaAnoBissexto();

       if (verificaAnoBissexto() == true){
            quantidadeDiasNoMes[2] = 29;
       } 
       
       //verifica se o dia informado com o mês
       if ( dia >=1 && dia <= quantidadeDiasNoMes[mes]){
        return true;
       }else{
        return false;
       }

    }
   
    @Override
    public String toString(){
        return String.format("%02d/%02d/%04d", dia, mes, ano);      
       
    }



    
}
