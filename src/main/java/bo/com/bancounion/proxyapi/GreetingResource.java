package bo.com.bancounion.proxyapi;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.Optional;

@Path("/hello")
public class GreetingResource {

    /*@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST by luis";
    }
    */
    @GET
    public String hello(@QueryParam("mensaje") String mensaje) {
        //return "Hello from Quarkus REST by luis "+mensaje;

        return Optional.ofNullable(mensaje)
                .map(n -> "->" +n)
                .orElse("el valor del mensaje es nulo");
    }

    @GET
    @Path("/{nombre}")
    public String saludar(@PathParam("nombrea") String nombre) {
        //return "Hello from Quarkus REST by luis "+mensaje;

        return "Hola " + nombre;
    }

    @GET
    @Path("/{id}/cuentas")
    public String cuentas(@PathParam("id") String id) {
        //return "Hello from Quarkus REST by luis "+mensaje;

        return "obtener cuentas del  " + id + " son : 1, 2, 3" ;
    }


}
