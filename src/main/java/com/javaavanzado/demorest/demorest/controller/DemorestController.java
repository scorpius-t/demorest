package com.javaavanzado.demorest.demorest.controller;

import com.javaavanzado.demorest.demorest.models.Demorest;
import com.javaavanzado.demorest.demorest.service.DemorestService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@Component
@Path("/")
public class DemorestController {

    private final DemorestService demorestService;
    public DemorestController(DemorestService demorestService){
        this.demorestService=demorestService;
        this.demorestService.add(new Demorest("hola", 23.0));
        this.demorestService.add(new Demorest("ciao", -010.0));
        this.demorestService.add(new Demorest("dellinspiron", 4569874));
        this.demorestService.add(new Demorest("samsung", 457));


        for(Demorest demotemp: demorestService.getAll()){
            System.out.println("hola");
            try {
                URI.create("/demorest/" + demotemp.getNombre());
            } catch (Exception e){
                System.out.println(e.getMessage());
            }

        }



    }

    @GET
    @Path("/demorest")
    @Produces("aplication/json")
    public List<Demorest> listarTodo(){
        return demorestService.getAll();
    }

    @GET
    @Path("/demorest/{nombre}")
    @Produces("application/json")
    public Demorest listarUno(@PathParam("nombre") String nombre) {
        return demorestService.get(nombre);
    }

    @POST
    @Path("/demorest/v2")
    @Consumes("application/json")

    public Response agregarDemorest(Demorest demorest){
        demorestService.add(demorest);
        System.out.println(demorest.toString());
        return Response.created(
                URI.create("/demorest/"+demorest.getNombre()))
                .build();
    }

}
