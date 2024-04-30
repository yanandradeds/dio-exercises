import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Conta contaAtual = new Conta();
        boolean continuar = true;

        System.out.println("Bem vindo ao banco, por favor nos informe alguns dados.");
        System.out.println("Seu nome: ");
        contaAtual.setNome(scanner.nextLine());
        System.out.println("Agencia: ");
        contaAtual.setAgencia(scanner.nextLine());
        System.out.println("Numero: ");
        contaAtual.setNumero(scanner.nextInt());
        System.out.printf("Ola %s , obrigado por criar uma conta em nosso banco, sua agencia eh %s, conta %d " +
                        "e seu saldo %.2f ja esta disponivel para saque.\n", contaAtual.getNome(), contaAtual.getAgencia(),
                contaAtual.getNumero(), contaAtual.getSaldo());

        while (continuar) {

            System.out.println("Operacoes possiveis: \n" +
                    "1 - Saque\n" +
                    "2 - Deposito\n" +
                    "3 - Sair\n");



            switch (scanner.nextInt()) {
                case 1 -> {
                    System.out.println("Valor do saque: ");
                    int saque = scanner.nextInt();
                    if (saque > contaAtual.getSaldo()) {
                        System.out.println("Saldo insuficiente");
                        break;
                    }
                    contaAtual.setSaldo(contaAtual.getSaldo() - saque);
                    System.out.println("Operacao com sucesso");
                }
                case 2 -> {
                    System.out.println("Valor de deposito: ");
                    contaAtual.setSaldo(contaAtual.getSaldo() + scanner.nextInt());
                }
                case 3 -> {
                    continuar = false;
                    System.out.println("Encerrado");
                }
                default -> System.out.println("Operacao invalida tente novamente");
            }


        }
    }
}
