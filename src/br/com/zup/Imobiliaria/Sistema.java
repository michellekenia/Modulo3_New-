package br.com.zup.Imobiliaria;

import java.util.Scanner;
/*
É na classe sistema onde tudo vai ser estabelecido para depois ser apenas executado no main.
Todas as classes serão conectadas, e métodos criados para que o programa cumpra a função estabelecida.
 */

public class Sistema {
    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menu() {
        System.out.println("VOCÊ ESTÁ NO SISTEMA DA IMOBILIÁRIA SOARES");
        System.out.println("Digite 1 para cadastrar um imóvel");
        System.out.println("Digite 2 para exibir a lista de imóveis cadastrados");
        System.out.println("Digite 3 para excluir um morador utilizando seu CPF.");
        System.out.println("Digite 4 para sair do sistema");
    }
}

