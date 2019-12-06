package com.personal.repositorios;

import com.personal.entidades.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * IProductoRepository
 */
@Repository
public interface IProductoRepository extends CrudRepository<Producto,Integer>{
    
}