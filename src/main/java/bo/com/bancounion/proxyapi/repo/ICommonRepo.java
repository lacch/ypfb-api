package bo.com.bancounion.proxyapi.repo;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

//@ApplicationScoped
public interface ICommonRepo <T, ID> extends PanacheRepositoryBase<T, ID> {
}
