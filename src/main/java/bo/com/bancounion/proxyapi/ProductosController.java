package bo.com.bancounion.proxyapi;


import bo.com.bancounion.proxyapi.Config.ModelMapperConfig;
import bo.com.bancounion.proxyapi.dto.ProductoDto;
import bo.com.bancounion.proxyapi.dto.ResponseData;
import bo.com.bancounion.proxyapi.model.Producto;
import bo.com.bancounion.proxyapi.repo.IProductoRepo;
//import bo.com.bancounion.proxyapi.repo.ProductoRepo;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.*;

@Path("/Productos")
//@Transactional
public class ProductosController {
    //private List<Producto> productos = new ArrayList<>();

    @Inject
    public IProductoRepo productoRepo;

    @Inject
    public ModelMapperConfig mapperConfig;
    //@Inject
    //private IProductoService productosServices;

    //@Inject
    //private ProductosServices productosServices;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response producto(){
        //return productoRepo.getAll();
        List<ProductoDto> list = productoRepo.getAll().stream().map(this::convertToDto).toList();
        ResponseData<List<ProductoDto>> response = new ResponseData<>(200, "SUCCESS", list, null);
        return Response.ok().entity(response).build();
    }
    /*@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String producto(){
        return "gllllllllllllll";
    }*/
    /*@Inject
    public ProductosController(ProductosServices services){
        this.productosServices = services;
    }*/
    /*@GET
    @Produces(MediaType.APPLICATION_JSON)
    //public List<ProductoDto> producto(){
    public List<Producto> producto(){
        //return Arrays.asList(
         //   new Producto("coca cocla", 15, 12),
         //       new Producto("ace", 21, 10),
         //       new Producto("aceite", 65, 500)
        //);
        //return  productosServices.getProductos();
        return productoRepo.listAll();
    }*/

    /*@GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public ProductoDto producto(@PathParam("id") int id){
        return new ProductoDto("coca cocla", 15, 12);
    }*/
    /*@POST
    @Produces(MediaType.APPLICATION_JSON)

    //public ProductoDto nuevoProducto(ProductoDto prod){
    public Producto nuevoProducto(Producto prod){
        //productosServices.addProducto(prod);
        productoRepo.persist(prod);
        return prod;
    }*/

   /* @GET
    @Path("/precioMaximo")
    @Produces(MediaType.TEXT_PLAIN)
    public Response precioMAximo(){
        if(productosServices.isEmpty()){
            return Response.status(404).entity("No data Found").build();
        } else {
            int precioMax = productosServices.precioMaximo();
            return Response.ok().header("X-hola","BuenosDias")
                    .entity(precioMax).build();
        }
    }*/

    /*@GET
    @Path("{nombreProd}")
    @Produces(MediaType.APPLICATION_JSON)
    public ProductoDto obtenerXnombreProd(@PathParam("nombreProd") String nomProd){
        //return productosServices.obtenerProducto(nomProd).get();
        return productosServices.obtenerProducto(nomProd)
                .orElseThrow(()->new NoSuchElementException("No existe el producto: " + nomProd));
    }*/


    private ProductoDto convertToDto(Producto obj){
        return mapperConfig.modelMapper().map(obj, ProductoDto.class);
    }

    private Producto convertToEntity(ProductoDto dto){
        return mapperConfig.modelMapper().map(dto, Producto.class);
    }


}
