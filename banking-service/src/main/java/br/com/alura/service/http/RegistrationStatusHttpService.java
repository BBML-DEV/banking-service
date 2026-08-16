package br.com.alura.service.http;


import br.com.alura.domain.http.AgencyHttp;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

//end-point da API
@Path("/situacao-cadastral")
@RegisterRestClient(configKey = "situacao-cadastral-api")
public interface RegistrationStatusHttpService {

    @GET
    @Path("{cnpj}")
    AgencyHttp searchCpnj(String cnpj);
}
