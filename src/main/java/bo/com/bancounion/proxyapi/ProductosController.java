package bo.com.bancounion.proxyapi;

import bo.com.bancounion.proxyapi.Dto.Producto;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.Arrays;
import java.util.List;

@Path("/Productos")
public class ProductosController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Producto> producto(){
        return Arrays.asList(
            new Producto("coca cocla", 15, 12),
                new Producto("ace", 21, 10),
                new Producto("aceite", 65, 500)
        );
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Producto producto(@PathParam("id") int id){
        return new Producto("coca cocla", 15, 12);
    }
}
