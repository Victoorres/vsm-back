package br.com.vsm.core;

 import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public class AbstractService<T> {

     protected JpaRepository<T, Long> repository;

     public List<T> findAll() {
        List<T> lista = repository.findAll();

        return lista;
    }

     public T findById(long id) {

        return repository.getOne(id);

    }

      public T save(T obj) {
        return repository.save(obj);
    }

     public T update(T obj) {
        return repository.save(obj);
    }

     public boolean delete(long id) {
        T obj = this.findById(id);
        if (obj != null) {
            repository.delete(obj);
            return true;
        }
        return false;
    }

     public boolean exist(long id) {
        return repository.existsById(id);
    }

}