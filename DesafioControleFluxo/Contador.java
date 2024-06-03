package DesafioControleFluxo;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner scanner = new Scanner(System.in);
        int[] entrada = new int[2];

        System.out.println("Digite o primeiro parametro");
        entrada[0] = scanner.nextInt();
        System.out.println("Digite o segundo parametro");
        entrada[1] = scanner.nextInt();

        if(entrada[0] > entrada[1]) {
            throw new ParametrosInvalidosException();
        }

        int quantityLoops = entrada[1] - entrada[0];

        for (int i = 0; i < quantityLoops; i++) {
            System.out.println("Imprimindo o numero " + i);
        }

    }


}
