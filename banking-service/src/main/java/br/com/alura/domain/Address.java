package br.com.alura.domain;

public class Address {
    private Integer id;
    private String street;
    private String addressLine;
    private String complement;
    private Integer streetNumber;


    public Integer getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public String getComplement() {
        return complement;
    }

    public Integer getStreetNumber() {
        return streetNumber;
    }
}
