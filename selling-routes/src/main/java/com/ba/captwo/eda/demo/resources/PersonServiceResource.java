package com.ba.captwo.eda.demo.resources;

import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * Created by u760245 on 05/07/2014.
 */
public class PersonServiceResource {


    @GET
    @Produces("application/json")
    @Path("/create")
    public Response createPerson(
            @MatrixParam("fname") String fname,
            @MatrixParam("lname") String lname,
            @MatrixParam("address") String address,
            @MatrixParam("city") String city){return null;}

    @GET
    @Produces("application/json")
    @Path("/read")
    public Response readPerson(
            @MatrixParam("pid") int pid){return null;};

    @GET
    @Produces("application/json")
    @Path("/update")
    public Response updatePerson(
            @MatrixParam("pid") int pid,
            @MatrixParam("fname") String fname,
            @MatrixParam("lname") String lname,
            @MatrixParam("address") String address,
            @MatrixParam("city") String city){return null;};

    @GET
    @Produces("application/json")
    @Path("/delete")
    public Response deletePerson(
            @MatrixParam("pid") int pid){return null;};

    @GET
    @Produces("application/json")
    @Path("/list")
    public Response listPersons(){return null;};
}
