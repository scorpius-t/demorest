package com.javaavanzado.demorest.demorest.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.springframework.stereotype.Component;

@Component
@Path("/")
public class DemorestController {

    @GET
    @Path("/")
    public String hola(){
        return "hola";
    }



}
