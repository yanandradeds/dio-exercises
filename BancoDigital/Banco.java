package BancoDigital;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Banco {

    private Integer numero;
    private final ArrayList<Conta> contas = new ArrayList<>();

    public Banco(Integer numero) {
        this.numero = numero;
    }

    public int[] geraNumeroEConta(){
        int[] informacion = new int[2];
        informacion[0] = numero;
        informacion[1] = contas.size()+1;
        return informacion;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void adicionaConta(Conta conta) {
        this.contas.add(conta);
    }
}
