package br.com.acme.model;

public class Cliente extends Pessoa {

    private String cpf;
    private String senha;
    private String numeroTelefone;
    private String endereco;

    public Cliente() {
    }

    public Cliente(String nome, String cpf, String senha, String numeroTelefone, String endereco) {
        super(nome);
        this.cpf = cpf;
        this.senha = senha;
        this.numeroTelefone = numeroTelefone;
        this.endereco = endereco;
    }

    public String gerarSenha() {
        return "abc123";
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cpf='" + cpf + '\'' +
                ", senha='" + senha + '\'' +
                ", numeroTelefone='" + numeroTelefone + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
