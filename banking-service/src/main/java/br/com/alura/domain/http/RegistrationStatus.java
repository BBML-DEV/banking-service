package br.com.alura.domain.http;

public enum RegistrationStatus {
    ACTIVE("ATIVO"),
    INACTIVE("INATIVO");

    RegistrationStatus(String externalValue) {
        this.externalVaue = externalValue;
    }
}
