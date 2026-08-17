package br.com.alura.controller;


import br.com.alura.service.http.AgencyService;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;
import org.jboss.resteasy.reactive.RestResponse;
import br.com.alura.domain.Agency;

@Path("/agencies")
public class AgencyController {

    private final AgencyService agencyService;

    AgencyController (AgencyService agencyService){
        this.agencyService = agencyService;
    }

    @POST
    @Transactional
    public RestResponse<Void> register(Agency agency, @Context UriInfo uriInfo){
        this.agencyService.register(agency);

        return RestResponse.created(uriInfo.getAbsolutePath());
    }

    @GET
    @Transactional
    @Path("{id}")
    public RestResponse<Agency> searchAgencyById(Long id){
        Agency agency = this.agencyService.searchAgenctById(id);
        return RestResponse.ok(agency);
    }

    @DELETE
    @Transactional
    @Path("{id}")
    public RestResponse<Void> deleteAgencyById(Long id){
        this.agencyService.deleteAgencyById(id);
        return RestResponse.ok();
    }

    @PUT
    public RestResponse<Void> updateAgency(Agency agency){
        this.agencyService.updateAgency(agency);
        return RestResponse.ok();
    }
}
