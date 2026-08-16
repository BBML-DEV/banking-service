package br.com.alura.domain;

import jakarta.persistence.*;

@Entity
public class Agency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;

    @Column(name = "razao_social")
    private String razaoSocial;
    private String cnpj;

    @OneToOne
    @JoinColumn(name = "endereco_id")
    private Address endereco;

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Address getEndereco() {
        return endereco;
    }
}
