/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.services;

import TestConnection.pepito;
import com.company.logic.PersonaLogic;
import com.mycompany.Entities.Persona;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author pc030
 */
@Path("Personas")
public class PersonasController {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of PersonasController
     */
    public PersonasController( ) {
        
    }

    /**
     * Retrieves representation of an instance of com.mycompany.services.PersonasController
     * @return an instance of java.lang.String
     */
    @Path("BuscarPersonas")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public pepito getJson(@QueryParam("numeroPersona") int numeroPersona) {
        //TODO return proper representation object
        Persona per= PersonaLogic.ConsultarPersona(numeroPersona);
        pepito p = new pepito();
        p.nombre="lui";
        p.apellido="caiza";
        return p;
    }

    /**
     * PUT method for updating or creating an instance of PersonasController
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
