package br.com.alura.domain.http;

public class AgencyHttp {
    private Integer id;
    private String nome;
    private String razaoSociaol;
    private String cnpj;
    private SituacaoCadastral situacaoCadastral;

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public SituacaoCadastral getSituacaoCadastral() {
        return situacaoCadastral;
    }

    public String getRazaoSociaol() {
        return razaoSociaol;
    }

    public String getCnpj() {
        return cnpj;
    }


}


