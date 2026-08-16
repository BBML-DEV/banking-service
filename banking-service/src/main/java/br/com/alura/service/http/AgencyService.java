package br.com.alura.service.http;

import br.com.alura.domain.Agency;
import br.com.alura.domain.http.AgencyHttp;
import br.com.alura.domain.http.SituacaoCadastral;
import br.com.alura.exception.AgencyNotFoundException;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.ArrayList;
import java.util.List;


@ApplicationScoped
public class AgencyService {

    @RestClient
    private RegistrationStatusHttpService registrationStatusHttpService;

    private List<Agency> agencies = new ArrayList<>();

    public void register(Agency agency){
        AgencyHttp agencyHttp = registrationStatusHttpService.searchCpnj(agency.getCnpj());

        if (agencyHttp != null && SituacaoCadastral.ATIVO.equals(agencyHttp.getSituacaoCadastral())) {
            agencies.add(agency);
        } else {
            throw new AgencyNotFoundException();
        }
    }
    public Agency searchAgenctById(Integer id){
        return agencies.stream().filter( agency -> agency.getId().equals(id)).toList().getFirst();
    }

    public void deleteAgencyById(Integer id){
        agencies.removeIf(agency -> agency.getId().equals(id));
    }

    public void updateAgency(Agency agency){
        deleteAgencyById(agency.getId());
        register(agency);
    }

}
