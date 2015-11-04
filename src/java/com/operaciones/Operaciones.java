package com.operaciones;

import datos.Alumnos;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import datos.DatosBD;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.core.Response;


@Stateless
@Path("/operacion")
public class Operaciones {
    
    @GET
    @Produces({"application/json"})
    public List<Alumnos> retornaAlgo() 
    {        
        return DatosBD.alumnos;
    }
    
    @POST 
    @Consumes({"application/json"})
    public Response guardarAlumno(Alumnos a)
    {
        DatosBD.alumnos.add(a);
        return Response.ok(a).build();
    }
    
}
