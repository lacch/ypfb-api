package bo.com.bancounion.proxyapi.services;


import bo.com.bancounion.proxyapi.exception.NotFoundException;
import bo.com.bancounion.proxyapi.repo.ICommonRepo;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Default;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

//@ApplicationScoped
@Named
//@Default
public  abstract class CRUDImpl <T, ID>  implements ICRUD<T, ID> {

    protected abstract ICommonRepo<T, ID> commonRepo();
    //@Inject
    //protected  ICommonRepo<T, ID> commonRepo;
    @Transactional
    @Override
    public void save(T t) {
        commonRepo().persist(t);
    }

    @Override
    public T update(T t, ID id) {
        return null;
    }

    @Override
    public List<T> findAll() {
        return commonRepo().listAll();
    }

    @Override
    public T findById(ID id) {

        Optional<T> data = commonRepo().findByIdOptional(id);
        if(data.isEmpty()){
            throw new  NotFoundException("El registro con valor ID: "+ id+ " no existe");
        }
        return data.get();
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
