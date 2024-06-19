package BancoDigital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RegistroTransacoesComStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();


        List<String> transacoes = new ArrayList<>();

        for (int i = 1; i <= quantidadeTransacoes; i++) {

            char tipoTransacao = scanner.next().toUpperCase().charAt(0);

            double valorTransacao = scanner.nextDouble();


            if (tipoTransacao == 'D') {
                saldo += valorTransacao;
                transacoes.add("Deposito de " + valorTransacao);
            } else if (tipoTransacao == 'S') {
                saldo -= valorTransacao;
                transacoes.add("Saque de " + valorTransacao);
            } else {
                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                i--;
            }
        }

        for (int i = 1; i <= quantidadeTransacoes; i++) {
            if(i == 1) {
                System.out.printf("Saldo: %.1f\n", saldo);
                System.out.printf("Transacoes:\n");
            }
            System.out.printf("%d. %s\n", i, transacoes.get(i - 1));
        }

        scanner.close();
    }
}

