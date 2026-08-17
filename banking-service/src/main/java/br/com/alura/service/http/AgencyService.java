package br.com.alura.service.http;

import br.com.alura.domain.Agency;
import br.com.alura.domain.http.AgencyHttp;
import br.com.alura.domain.http.SituacaoCadastral;
import br.com.alura.exception.AgencyNotFoundException;
import br.com.alura.repository.AgencyRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class AgencyService {

    @RestClient
    private RegistrationStatusHttpService registrationStatusHttpService;

    private final AgencyRepository agencyRepository;

    AgencyService(AgencyRepository agencyRepository){
        this.agencyRepository = agencyRepository;
    }

    public void register(Agency agency){
        AgencyHttp agencyHttp = registrationStatusHttpService.searchCpnj(agency.getCnpj());

        if (agencyHttp != null && SituacaoCadastral.ATIVO.equals(agencyHttp.getSituacaoCadastral())) {
            agencyRepository.persist(agency);
        } else {
            throw new AgencyNotFoundException();
        }
    }
    public Agency searchAgenctById(Long id){
        return agencyRepository.findById(id);
    }

    public void deleteAgencyById(Long id){
       agencyRepository.deleteById(id);
    }

    public void updateAgency(Agency agency){
        agencyRepository.update("nome = ?1, razaoSocial = ?2, cnpj = ?3 where id = ?4", agency.getNome(), agency.getRazaoSocial(), agency.getCnpj(), agency.getId());
    }

}
