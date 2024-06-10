package BancoDigital;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Banco brasil = new Banco(1);
        Cliente cliente = new Cliente("yan","444.444.444-12");
        Conta conta = new Conta(cliente,brasil);

        conta.deposito(5000d);
        conta.verSaldo();
    }


}
