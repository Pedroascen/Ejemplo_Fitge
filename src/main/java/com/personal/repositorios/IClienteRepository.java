package com.personal.repositorios;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.personal.entidades.Cliente;

@Repository
public interface IClienteRepository extends CrudRepository<Cliente,Integer>{

}
