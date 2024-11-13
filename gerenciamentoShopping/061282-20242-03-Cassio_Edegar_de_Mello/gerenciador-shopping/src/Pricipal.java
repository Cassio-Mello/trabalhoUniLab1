import java.util.Scanner;

import br.com.cassioMello.clases.Alimentacao;
import br.com.cassioMello.clases.Bijuteria;
import br.com.cassioMello.clases.Cosmetico;
import br.com.cassioMello.clases.Data;
import br.com.cassioMello.clases.Endereco;
import br.com.cassioMello.clases.Informatica;
import br.com.cassioMello.clases.Loja;
import br.com.cassioMello.clases.Produto;
import br.com.cassioMello.clases.Shopping;
import br.com.cassioMello.clases.Vestuario;

public class Pricipal {
    public static void main(String[] args) {
        
        //criando Scanner para receber dados
        Scanner scanner = new Scanner(System.in);
       
        //variavel de opções do menu
        char opcao = ' ';
        
        //iniciando objetos com valor null
        Loja loja = null;
        Produto produto = null;
        Shopping shopping = null;
        
        //laço para menu de seleção
        while (opcao != '4'){

            //menu
            System.out.println("\n...::Informe a opção Desejada::...");
            System.out.println("||||||||||||||||||||||||||||||||||");
            System.out.println("||1.Cadastrar Shopping          ||");
            System.out.println("||                              ||");
            System.out.println("||2.Cadastrar Loja              ||");
            System.out.println("||                              ||");
            System.out.println("||3.Criar produto               ||");
            System.out.println("||                              ||");
            System.out.println("||4.Sair                        ||");
            System.out.println("||||||||||||||||||||||||||||||||||");

            //variavel para receber a opção do menu
            String input = scanner.nextLine();

            //variavel char com funçao para pegar apenas o indice 0 do que foi digitado
            char opcaoDigitada = input.charAt(0);

            //condição para entrar no menu desejado e verificar a validade do que foi digitado

            if (opcaoDigitada == '1'){//opção 1 entra no cadastro de shopping

                limparTela();

                System.out.println("...::CADASTRO DE SHOPPING::...");
                System.out.println("Nome do novo shopping:");
                String nomeShopping = scanner.nextLine();

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

                System.out.println("Informe a quantidade de lojas:");
                int qtdLojas = scanner.nextInt();

                scanner.nextLine();

                shopping = new Shopping(nomeShopping, endereco, qtdLojas);



            }else if (opcaoDigitada == '2'){//opção 2 entra no cadastro de Loja

                //verifica se tem shopping cadastrado para permitir cadastrar lojas
                if (shopping == null){
                    limparTela();

                    System.out.println("   ..::ATENÇÃO! NENHUM SHOPPING CADASTRADO::..");
                    System.out.println(">>>Cadastre um SHOPPING para cadastrar lojas!<<<");
                    continue;
                }

                limparTela();


                char opcaoLoja = ' ';
                
                while (opcaoLoja != '6'){


                    System.out.println("\n..::CADASTRO DE LOJA::..");
                    System.out.println("\n...::Informe o tipo de Loja::...");
                    System.out.println("||||||||||||||||||||||||||||||||||");
                    System.out.println("||1.Alimentação                 ||");
                    System.out.println("||                              ||");
                    System.out.println("||2.Bijuteria                   ||");
                    System.out.println("||                              ||");
                    System.out.println("||3.Cosmético                   ||");
                    System.out.println("||                              ||");
                    System.out.println("||4.Informática                 ||");
                    System.out.println("||                              ||");
                    System.out.println("||5.Vestuário                   ||");
                    System.out.println("||                              ||");
                    System.out.println("||6.Sair                        ||");
                    System.out.println("||||||||||||||||||||||||||||||||||");

                    //variavel para receber a opção do menu
                    String input2 = scanner.nextLine();

                    //variavel char com funçao para pegar apenas o indice 0 do que foi digitado
                    char opcaoLojaDigitada = input2.charAt(0);

                    if (opcaoLojaDigitada == '1'){

                        System.out.println("Nome da Loja: ");
                        String nomeLoja = scanner.nextLine();

                        System.out.println("\nQuatidade funcionários: ");
                        int quantidadeFuncionarios = scanner.nextInt();
                
                        System.out.println("\nSalário base: ");
                        double salarioBase = scanner.nextDouble();

                        System.out.println("\nInforme a qauntidade de produtos: ");
                        int quantidadeProdutos = scanner.nextInt();

                        System.out.println("\nInforme a data de válidade do alvará: ");
                        System.out.println("Dia: ");
                        int diaAlvara = scanner.nextInt();
                        System.out.println("Mês: ");
                        int mesAlvara = scanner.nextInt();
                        System.out.println("Ano: ");
                        int anoAlvara = scanner.nextInt();

                        //Criando objeto dataAlvara
                        Data dataAlvara = new Data(diaAlvara, mesAlvara, anoAlvara);
                                        
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
                        Endereco enderecoLoja = new Endereco(nomeRua, cidade, estado, pais, cep, numero, complemento);

                        //selecionando o tipo do método construtor do objeto loja
                        if (salarioBase != 0){       
                            loja = new Alimentacao(nomeLoja, quantidadeFuncionarios, salarioBase, enderecoLoja, dataFundacao, dataAlvara, quantidadeProdutos);
                
                        }else{
                            loja = new Alimentacao(nomeLoja, quantidadeFuncionarios, enderecoLoja, dataFundacao, dataAlvara, quantidadeProdutos);
                        }


                        if (shopping.insereLoja(loja) == true){                        
                            limparTela();
                            System.out.println("..::LOJA CADASTRADA COM SUCESSO::..\n");
                            continue;
                        }else{
                            System.out.println("Não existe espaço disponivél para cadastrar nova loja");
                            continue;
                        } 

                    }else if (opcaoLojaDigitada == '2'){

                        System.out.println("Nome da Loja: ");
                        String nomeLoja = scanner.nextLine();

                        System.out.println("\nQuatidade funcionários: ");
                        int quantidadeFuncionarios = scanner.nextInt();
                
                        System.out.println("\nSalário base: ");
                        double salarioBase = scanner.nextDouble();

                        System.out.println("\nInforme a qauntidade de produtos: ");
                        int quantidadeProdutos = scanner.nextInt();

                        System.out.println("\nInforme a meta de vendas: ");
                        double metaVendas = scanner.nextDouble();
                                        
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
                        Endereco enderecoLoja = new Endereco(nomeRua, cidade, estado, pais, cep, numero, complemento);

                        //selecionando o tipo do método construtor do objeto loja
                        if (salarioBase != 0){       
                            loja = new Bijuteria(nomeLoja, quantidadeFuncionarios, salarioBase, enderecoLoja, dataFundacao, metaVendas, quantidadeProdutos);
                
                        }else{
                            loja = new Bijuteria(nomeLoja, quantidadeFuncionarios, enderecoLoja, dataFundacao, metaVendas, quantidadeProdutos);
                        }

                        if (shopping.insereLoja(loja) == true){                        
                            limparTela();
                            System.out.println("..::LOJA CADASTRADA COM SUCESSO::..\n");
                            continue;
                        }else{
                            System.out.println("Não existe espaço disponivél para cadastrar nova loja");
                            continue;
                        }
                    }else if (opcaoLojaDigitada == '3'){


                        System.out.println("Nome da Loja: ");
                        String nomeLoja = scanner.nextLine();

                        System.out.println("\nQuatidade funcionários: ");
                        int quantidadeFuncionarios = scanner.nextInt();
                
                        System.out.println("\nSalário base: ");
                        double salarioBase = scanner.nextDouble();

                        System.out.println("\nInforme a qauntidade de produtos: ");
                        int quantidadeProdutos = scanner.nextInt();

                        System.out.println("\nInforme a taxa de comercialização: ");
                        double taxaComercializacao = scanner.nextDouble();
                                        
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
                        Endereco enderecoLoja = new Endereco(nomeRua, cidade, estado, pais, cep, numero, complemento);

                        //selecionando o tipo do método construtor do objeto loja
                        if (salarioBase != 0){       
                            loja = new Cosmetico(nomeLoja, quantidadeFuncionarios, salarioBase, enderecoLoja, dataFundacao, taxaComercializacao, quantidadeProdutos);
                
                        }else{
                            loja = new Cosmetico(nomeLoja, quantidadeFuncionarios, enderecoLoja, dataFundacao, taxaComercializacao, quantidadeProdutos);
                        }

                        if (shopping.insereLoja(loja) == true){                        
                            limparTela();
                            System.out.println("..::LOJA CADASTRADA COM SUCESSO::..\n");
                            continue;
                        }else{
                            System.out.println("Não existe espaço disponivél para cadastrar nova loja");
                            continue;
                        }
                    }else if (opcaoLojaDigitada == '4'){


                        System.out.println("Nome da Loja: ");
                        String nomeLoja = scanner.nextLine();

                        System.out.println("\nQuatidade funcionários: ");
                        int quantidadeFuncionarios = scanner.nextInt();
                
                        System.out.println("\nSalário base: ");
                        double salarioBase = scanner.nextDouble();

                        System.out.println("\nInforme a qauntidade de produtos: ");
                        int quantidadeProdutos = scanner.nextInt();

                        System.out.println("\nInforme o valor do seguro: ");
                        double valorSeguro = scanner.nextDouble();
                                        
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
                        Endereco enderecoLoja = new Endereco(nomeRua, cidade, estado, pais, cep, numero, complemento);

                        //selecionando o tipo do método construtor do objeto loja
                        if (salarioBase != 0){       
                            loja = new Informatica(nomeLoja, quantidadeFuncionarios, salarioBase, enderecoLoja, dataFundacao, quantidadeProdutos, valorSeguro);
                
                        }else{
                            loja = new Informatica(nomeLoja, quantidadeFuncionarios, enderecoLoja, dataFundacao, quantidadeProdutos, valorSeguro);
                        }

                        if (shopping.insereLoja(loja) == true){                        
                            limparTela();
                            System.out.println("..::LOJA CADASTRADA COM SUCESSO::..\n");
                            continue;
                        }else{
                            System.out.println("Não existe espaço disponivél para cadastrar nova loja");
                            continue;
                        } 
                    }
                    if (opcaoLojaDigitada == '5'){


                        System.out.println("Nome da Loja: ");
                        String nomeLoja = scanner.nextLine();

                        System.out.println("\nQuatidade funcionários: ");
                        int quantidadeFuncionarios = scanner.nextInt();
                
                        System.out.println("\nSalário base: ");
                        double salarioBase = scanner.nextDouble();

                        System.out.println("\nInforme a qauntidade de produtos: ");
                        int quantidadeProdutos = scanner.nextInt();

                        System.out.println("\nInforme se comercializa produtos importados:[S]im ou [N]ão ");
                        String importadoSimNao = scanner.nextLine();
                        boolean produtoImportado;
                        if (importadoSimNao.equalsIgnoreCase("S")){
                            produtoImportado = true;
                        }else{
                            produtoImportado = false;
                        }

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
                        Endereco enderecoLoja = new Endereco(nomeRua, cidade, estado, pais, cep, numero, complemento);

                        //selecionando o tipo do método construtor do objeto loja
                        if (salarioBase != 0){       
                            loja = new Vestuario(nomeLoja, quantidadeFuncionarios, salarioBase, enderecoLoja, dataFundacao, produtoImportado, quantidadeProdutos);
                
                        }else{
                            loja = new Vestuario(nomeLoja, quantidadeFuncionarios, enderecoLoja, dataFundacao, produtoImportado, quantidadeProdutos);
                        }

                        if (shopping.insereLoja(loja) == true){                        
                            limparTela();
                            System.out.println("..::LOJA CADASTRADA COM SUCESSO::..\n");
                            continue;
                        }else{
                            System.out.println("Não existe espaço disponivél para cadastrar nova loja");
                            continue;
                        }

                    }else if (opcaoLojaDigitada == '6'){//opção 6 sai do cadastro de lojas1

                        limparTela();
                        System.out.println("\n   ..::Você saiu do Cadastro de Lojas!::..");
                        opcaoLoja = opcaoLojaDigitada;
                    
                
                    }else{ //exibe mensagem se a opção digitada é inválida
                        limparTela();
                        System.out.println("\n     ..::OPÇÃO INVÁLIDA::..\n");
                        continue;
                    }
                }               
                
            }else if (opcaoDigitada == '3'){//opçao 2 entra no cadastro de produtos

                //verifica se tem loja cadastrada para permitir cadastrar produtos
                if (loja == null){
                    limparTela();

                    System.out.println("   ..::ATENÇÃO! NENHUMA LOJA CADASTRADA::..");
                    System.out.println(">>>Cadastre uma LOJA para cadastrar produtos!<<<");
                    continue;
                }

                System.out.println("Informe o nome da loja para qual deseja cadastrar produtos: ");
                String nomeLoja = scanner.nextLine();

                Loja lojaSelecionada = shopping.buscarLoja(nomeLoja);

                if (lojaSelecionada == null){
                    System.out.println("Loja não encontrada! Verifique o nome informado");

                }else{

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

                    if (lojaSelecionada.insereProduto(produto)){
                        System.out.println("Produto cadastrado com sucesso na loja " + lojaSelecionada.getNome());

                    }else{
                        System.out.println("...::ATENÇÃO ESTOQUE CHEIO::..\n Não existe espaço vazio para cadastrar novos produtos");
                    }
                }        
                
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
            
            
            }else if (opcaoDigitada == '4'){//opção 3 sai do programa

                limparTela();
                System.out.println("\n   ..::Você saiu do Sistema::..");
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
