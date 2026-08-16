package br.com.alura.controller;


import br.com.alura.service.http.AgencyService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;
import org.jboss.resteasy.reactive.RestResponse;
import br.com.alura.domain.Agency;

@Path("/agencies")
public class AgencyController {

    private AgencyService agencyService;

    AgencyController (AgencyService agencyService){
        this.agencyService = agencyService;
    }

    @POST
    public RestResponse<Void> register(Agency agency, @Context UriInfo uriInfo){
        this.agencyService.register(agency);

        return RestResponse.created(uriInfo.getAbsolutePath());
    }

    @GET
    @Path("{id}")
    public RestResponse<Agency> searchAgencyById(Integer id){
        Agency agency = this.agencyService.searchAgenctById(id);
        return RestResponse.ok(agency);
    }

    @DELETE
    @Path("{id}")
    public RestResponse<Void> deleteAgencyById(Integer id){
        this.agencyService.deleteAgencyById(id);
        return RestResponse.ok();
    }

    @PUT
    public RestResponse<Void> updateAgency(Agency agency){
        this.agencyService.updateAgency(agency);
        return RestResponse.ok();
    }
}
