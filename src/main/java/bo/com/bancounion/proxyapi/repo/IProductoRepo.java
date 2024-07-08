package bo.com.bancounion.proxyapi.repo;

import bo.com.bancounion.proxyapi.model.Producto;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Default;

import java.util.List;

//@ApplicationScoped
//@Default
public interface IProductoRepo extends ICommonRepo<Producto, Long> {
    /*public List<Producto> getAll();

    public void saveProd(Producto producto);*/
}
