package com.personal.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.personal.entidades.Estudiante;

@Repository
public interface IEstudianteRepository extends CrudRepository<Estudiante, Integer> {
}
