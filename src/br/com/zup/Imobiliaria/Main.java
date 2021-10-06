package br.com.zup.Imobiliaria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Iniciando testes
        Scanner leitor = new Scanner(System.in);
        Imobiliaria imobiliaria = new Imobiliaria();

        int opcaoMenu = 0;
        boolean menu = true;

        while (menu == true) {
            System.out.println();
            opcaoMenu = leitor.nextInt();
            leitor.nextLine();
        }

    }
}
