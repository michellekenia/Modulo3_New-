package br.com.zup.Imobiliaria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) { //Iniciando testes
        Scanner leitor = new Scanner(System.in);
        Imobiliaria imobiliaria = new Imobiliaria();

        int opcaoMenu = 0;
        boolean menu = true;

        while (menu == true) {

            System.out.println("VOCÊ ESTÁ NO SISTEMA DA IMOBILIÁRIA SOARES");
            System.out.println("Digite 1 para cadastrar um imóvel");
            System.out.println("Digite 2 para exibir a lista de imóveis cadastrados");
            System.out.println("Digite 3 para sair do sistema");

            opcaoMenu = leitor.nextInt();
            leitor.nextLine();

            if (opcaoMenu == 1) {

                System.out.println("Digite o endereço do imóvel: ");
                String endereco = leitor.nextLine();

                System.out.println("Digite o valor do aluguel: ");
                double valorAluguel= leitor.nextDouble();
                leitor.nextLine();

                System.out.println("Digite o nome do funcionário responsável: ");
                String nomeFuncionario = leitor.nextLine();

                System.out.println("Digite o cpf do funcionário responsável: ");
                String cpfFuncionario = leitor.nextLine();

                System.out.println("Digite o código do funcionário responsável: ");
                String codigoFuncionario = leitor.nextLine();

                Funcionario funcionario = new Funcionario(nomeFuncionario, cpfFuncionario, codigoFuncionario);

                Imovel imovel = new Imovel(endereco, valorAluguel, funcionario);

                imobiliaria.adicionarImovel(imovel);

                System.out.println("Quantos moradores serão cadastrados?");
                int quantidaDeMoradores = leitor.nextInt();

                if (quantidaDeMoradores == 0) {
                    System.out.println("Você finalizou o cadastro de imóveis.");
                    return;
                }

                int resposta = 0;

                for (int i = 0; i < quantidaDeMoradores; i++) {

                    System.out.println("Digite o nome do morador: ");
                    String nomeMorador = leitor.nextLine();

                    System.out.println("Digite o cpf do morador: ");
                    String cpfMorador = leitor.nextLine();

                    System.out.println("Digite o telefone do morador: ");
                    String telefoneMorador = leitor.nextLine();

                    System.out.println("Digite a renda do morador: ");
                    Double rendaMorador = leitor.nextDouble();

                    Morador morador = new Morador(nomeMorador, cpfMorador, telefoneMorador, rendaMorador);
                    imovel.adicionarMorador(morador);
                }

            } else if (opcaoMenu == 2) {
                System.out.println(imobiliaria);
            } else {

                System.out.println("Você saiu do sistema da imobiliária. Volte sempre.");
                menu = false;
            }


        }


    }
}

