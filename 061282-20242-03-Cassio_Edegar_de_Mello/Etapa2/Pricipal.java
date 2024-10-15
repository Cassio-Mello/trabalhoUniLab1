import java.util.Scanner;

import br.com.cassioMello.clases.Data;
import br.com.cassioMello.clases.Endereco;
import br.com.cassioMello.clases.Loja;
import br.com.cassioMello.clases.Produto;

public class Pricipal {
    public static void main(String[] args) {
        
        //criando Scanner para receber dados
        Scanner scanner = new Scanner(System.in);
       
        //variavel de opções do menu
        char opcao = ' ';
        
        //iniciando objeto loja com valor null
        Loja loja = null;
        Produto produto = null;
        
        //laço para menu de seleção
        while (opcao != '3'){

            //menu
            System.out.println("\n...::Informe a opção Desejada::...");
            System.out.println("||||||||||||||||||||||||||||||||||");
            System.out.println("||1.Criar loja                  ||");
            System.out.println("||                              ||");
            System.out.println("||2.Criar produto               ||");
            System.out.println("||                              ||");
            System.out.println("||3.Sair                        ||");
            System.out.println("||||||||||||||||||||||||||||||||||");

            //variavel para receber a opção do menu
            String input = scanner.nextLine();

            //variavel char com funçao para pegar apenas o indice 0 do que foi digitado
            char opcaoDigitada = input.charAt(0);

            //condição para entrar no menu desejado e verificar a validade do que foi digitado
            if (opcaoDigitada == '1'){//opção 1 entra no cadastro de Loja

                limparTela();

                System.out.println("\n..::CADASTRO DE LOJA::..");
                System.out.println("Nome da Loja: ");
                String nome = scanner.nextLine();

                System.out.println("\nQuatidade funcionários: ");
                int quantidadeFuncionarios = scanner.nextInt();
                
                System.out.println("\nSalário base: ");
                double salarioBase = scanner.nextDouble();
                
                scanner.nextLine(); //consumir linha
            
                System.out.println("\n..::Data de fundação::..");

                System.out.println("Dia: ");
                int dia = scanner.nextInt();
                
                System.out.println("Mês: ");
                int mes = scanner.nextInt();
                
                System.out.println("Ano: ");
                int ano = scanner.nextInt();

                scanner.nextLine(); //consumir linha

                //criando objeto dataFundacao
                Data dataFundacao = new Data(dia, mes, ano);

                System.out.println("..::Endereço::..");

                System.out.println("Rua/Avenida: ");
                String nomeRua = scanner.nextLine();
                
                System.out.println("\nCidade: ");
                String cidade = scanner.nextLine();
                
                System.out.println("\nEstado: ");
                String estado = scanner.nextLine();
                
                System.out.println("\nPaís: ");
                String pais = scanner.nextLine();
                
                System.out.println("\nCEP: ");
                String cep = scanner.nextLine();
                
                System.out.println("\nNúmero: ");
                String numero = scanner.nextLine();
                
                System.out.println("\nComplemento: ");
                String complemento = scanner.nextLine();

                //criando objeto endereco
                Endereco endereco = new Endereco(nomeRua, cidade, estado, pais, cep, numero, complemento);

                //selecionando o tipo do método construtor do objeto loja
                if (salarioBase != 0){       
                    loja = new Loja(nome, quantidadeFuncionarios, salarioBase, endereco, dataFundacao);
                
                }else{
                    loja = new Loja(nome, quantidadeFuncionarios, endereco, dataFundacao);
                }

                limparTela();
                System.out.println("..::LOJA CADASTRADA COM SUCESSO::..\n");
                continue;
                
            }else if (opcaoDigitada == '2'){//opçao 2 entra no cadastro de produtos

                //verifica se tem loja cadastrada para permitir cadastrar produtos
                if (loja == null){
                    limparTela();

                    System.out.println("   ..::ATENÇÃO! NENHUMA LOJA CADASTRADA::..");
                    System.out.println(">>>Cadastre uma loja para cadastrar produtos!<<<");
                    continue;
                }

                limparTela();

                System.out.println("\n..::CADASTRO DE PRODUTOS::..");
                System.out.println("Produto: ");
                String nomeProduto = scanner.nextLine();
               
                System.out.println("Preço: ");
                double preco = scanner.nextDouble();

                scanner.nextLine(); //consumir linha

                System.out.println("..::Data de Validade::..");
                System.out.println("Dia: ");
                int dia = scanner.nextInt();
               
                System.out.println("Mês: ");
                int mes = scanner.nextInt();
               
                System.out.println("Ano: ");
                int ano = scanner.nextInt();

                scanner.nextLine(); //consumir linha

                //criando objeto dataValidade
                Data dataValidade = new Data(dia, mes, ano);

                //criando objeto produto
                produto = new Produto(nomeProduto, preco, dataValidade);

                
                limparTela();
                //imprimindo dados da loja e produto cadastrados
                System.out.println(loja);

                System.out.println(produto);
                
                //verificando se o produto está venciso através do método estaVencido()
                if (produto.estaVencido(new Data(20, 10, 2023)) == true){
                    System.out.println("..::ATENÇÃO! PRODUTO VENCIDO::..\n");

                }else{
                    System.out.println("..::PRODUTO DENTRO DA VALIDADE::..\n");
                }

                continue;
            
            }else if (opcaoDigitada == '3'){//opção 3 sai do programa

                limparTela();
                System.out.println("\n   ..::Você saiu do sitema!::..");
                opcao = opcaoDigitada;
            
            }else{ //exibe mensagem se a opção digitada é inválida
                limparTela();
                System.out.println("\n     ..::OPÇÃO INVÁLIDA::..\n");
                continue;
                
            }   

        }

        //fechando o scanner
        scanner.close();

    }
    //método para limpar tela
    static void limparTela(){
        for (int i = 0; i < 50; i++){
           System.out.println();
        }
    }
}
