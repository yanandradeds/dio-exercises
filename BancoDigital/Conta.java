package BancoDigital;

public class Conta {

    private Integer numero;
    private Integer conta;
    private Cliente client;
    private double saldo = 0d;

    public Conta(Cliente client, Banco banco) {
        this.client = client;
        int[] numeroEConta = banco.geraNumeroEConta();
        numero = numeroEConta[0];
        conta = numeroEConta[1];
    }

    void deposito(double valor){
        saldo += valor;
        System.out.printf("Novo saldo: R$%.2f\n", saldo);
    }

    void saque(double valor) {
        if(valor >= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }

    void verSaldo(){
        System.out.printf("Saldo: R$%.2f\n", saldo);
    }

    public Integer getNumero() {
        return numero;
    }

    public Integer getConta() {
        return conta;
    }

    public Cliente getClient() {
        return client;
    }
}
