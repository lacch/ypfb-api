package bo.com.bancounion.proxyapi.services;

import bo.com.bancounion.proxyapi.model.Producto;
//import bo.com.bancounion.proxyapi.repo.ICommonRepo;
//import bo.com.bancounion.proxyapi.repo.IProductoRepo;
import bo.com.bancounion.proxyapi.repo.IProductoRepo;
import jakarta.enterprise.inject.Default;
import jakarta.inject.Inject;
import jakarta.inject.Named;

//@ApplicationScoped
//@Transactional
@Named
@Default
public class ProductosServices extends CRUDImpl<Producto, Long> implements IProductoService{

    //private List<ProductoDto> productos = new ArrayList<>();
    @Inject
    private IProductoRepo repo;

   /* @Override
    public List<Producto> getListProductos() {
        return repo.getAll();
    }*/

    //@Override
    /*protected ICommonRepo<Producto, Long> getCommonRepo() {
        return repo;
    }*/

   /* @Override
    public List<ProductoDto> getProductos() {
        return Collections.unmodifiableList(productos);
    }

    @Override
    public void addProducto (ProductoDto producto){
        productos.add(producto);
    }
    @Override
    public int precioMaximo() {
        return productos.stream().mapToInt(ProductoDto::getPrecio).max().getAsInt();
    }

    @Override
    public boolean isEmpty() {
        return productos.isEmpty();
    }

    @Override
    public Optional<ProductoDto> obtenerProducto(String nombre) {
        return productos.stream()
                .filter(p->p.getNombre().equals(nombre))
                .findAny();
    }*/


}
