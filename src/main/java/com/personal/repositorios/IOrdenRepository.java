package com.personal.repositorios;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.personal.entidades.Venta;

/**
 * IOrdenRepository
 */
@Repository
public interface IOrdenRepository extends CrudRepository<Venta,Integer>{

    
}