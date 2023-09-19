package com.charbio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
        static int parametroUm, parametroDois;

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        try {
            System.out.print("\nDigite o primeiro parâmetro: ");
            parametroUm = leitor.nextInt();
            System.out.print("Digite o segundo parâmetro: ");
            parametroDois = leitor.nextInt();

        }catch(InputMismatchException e) {
            System.out.println("Entrada Invalida! Digite um Número Inteiro!");
        }

        try {
            contar(parametroUm, parametroDois);
        }catch(ParametrosInvalidoException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidoException {
        if(parametroUm > parametroDois)
            throw new ParametrosInvalidoException();

        int contagem = parametroDois - parametroUm;
            for(int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo o número " + i);
            }
    }
}
