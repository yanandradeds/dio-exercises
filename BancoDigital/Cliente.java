package BancoDigital;

public class Cliente {

    private final String name;
    private final String cpf;

    public Cliente(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }
}
