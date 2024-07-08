package bo.com.bancounion.proxyapi.services;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

//@ApplicationScoped
public interface ICRUD<T, ID>{

    void save(T t);
    T update(T t, ID id);
    List<T> findAll();
    T findById(ID id);
    void delete(ID id);
}
