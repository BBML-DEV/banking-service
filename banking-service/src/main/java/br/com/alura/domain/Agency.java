package br.com.alura.domain;

public class Agency {
    private Integer id;
    private String name;
    private String socialreason;
    private String cnpj;
    private Address address;

    public String getName() {
        return name;
    }

    public String getSocialreason() {
        return socialreason;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Address getAddress() {
        return address;
    }

    public Integer getId() {return id;}
}
