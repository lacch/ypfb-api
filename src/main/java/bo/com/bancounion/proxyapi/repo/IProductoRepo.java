package bo.com.bancounion.proxyapi.repo;

import bo.com.bancounion.proxyapi.model.Producto;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

//@ApplicationScoped
public interface IProductoRepo extends PanacheRepositoryBase<Producto, Long> {
    public List<Producto> getAll();
}
