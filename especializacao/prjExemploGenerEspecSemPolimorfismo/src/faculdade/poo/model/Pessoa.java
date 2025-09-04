package faculdade.poo.model;

/**
 *
 * @author h-and-rod
 */

public class Pessoa {
    // Super Classe Pessoa
    private String nome;
    private String dataNascimento;

    public Pessoa(String n, String dn) {
        nome = n;
        dataNascimento = dn;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
}

