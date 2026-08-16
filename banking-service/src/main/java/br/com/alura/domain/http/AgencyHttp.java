package br.com.alura.domain.http;

public class AgencyHttp {
    private Integer id;
    private String agencyName;
    private String socialReason;
    private String cnpj;
    private RegistrationStatus registrationStatus;

    public String getAgencyName() {
        return agencyName;
    }

    public String getSocialReason() {
        return socialReason;
    }

    public String getCnpj() {
        return cnpj;
    }

    public RegistrationStatus getRegistrationStatus() {
        return registrationStatus;
    }

    public Integer getId() {
        return id;
    }
}
