package br.com.alura.domain;

public class Agency {
    private Integer id;
    private String nome;
    private String razaosocial;
    private String cnpj;
    private Address endereco;

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getRazaosocial() {
        return razaosocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Address getEndereco() {
        return endereco;
    }
}
