package br.com.zup.Imobiliaria;

import java.util.Scanner;

public class Sistema {
    private static Scanner capturarDados (String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

}
