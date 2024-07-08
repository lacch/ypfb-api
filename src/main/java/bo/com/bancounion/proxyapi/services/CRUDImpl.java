package bo.com.bancounion.proxyapi.services;

import bo.com.bancounion.proxyapi.repo.ICommonRepo;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Default;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.util.List;

//@ApplicationScoped
@Named
@Default
public  class CRUDImpl <T, ID>  implements ICRUD<T, ID> {

    @Inject
    protected  ICommonRepo<T, ID> getCommonRepo;
    @Override
    public void save(T t) {

    }

    @Override
    public T update(T t, ID id) {
        return null;
    }

    @Override
    public List<T> findAll() {
        return null;
    }

    @Override
    public T findById(ID id) {
        return null;
    }

    @Override
    public void delete(ID id) {

    }

    /*@Inject
    protected  ICommonRepo<T, ID> getCommonRepo;
    @Override
    public void save(T t) {
          getCommonRepo.persist(t);
    }

    @Override
    public T update(T t, ID id) {
        return null;//getCommonRepo().update(t);
    }

    @Override
    public List<T> findAll() {
        return (List<T>) getCommonRepo.findAll();
    }

    @Override
    public T findById(ID id) {
        return getCommonRepo.findById(id);//. .orElseThrow(()-> new ModelNotFoundException("ID NOT FOUND: " + id));
    }

    @Override
    public void delete(ID id) {
        getCommonRepo.deleteById(id);
    }*/



}
