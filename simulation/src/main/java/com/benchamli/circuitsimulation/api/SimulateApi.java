package com.benchamli.circuitsimulation.api;

import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
 
import java.util.List;

@Path("/simulate")
public class SimulateApi {

    @POST
    public String Simulate() {
        return "Hello, Quarkus!";
    }
}