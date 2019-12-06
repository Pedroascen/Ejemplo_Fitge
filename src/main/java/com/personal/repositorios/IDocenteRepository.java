package com.personal.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.personal.entidades.Docente;



@Repository
public interface IDocenteRepository extends CrudRepository<Docente, Integer> {

}
