package bo.com.bancounion.proxyapi.repo;

import bo.com.bancounion.proxyapi.model.Producto;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

import static io.quarkus.hibernate.orm.panache.PanacheEntityBase.findAll;


@ApplicationScoped
public class ProductoRepo implements IProductoRepo {

    public List<Producto> getAll(){
        return findAll().stream().toList();
    }
}
