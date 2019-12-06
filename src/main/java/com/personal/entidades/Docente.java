package com.personal.entidades;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "docentes")
public class Docente {
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
		
	@NotNull(message = "campo requerido")
	private String nombre;
	
	@ManyToOne(optional = false,fetch = FetchType.EAGER)
	private Especialidad especialidad;
	
	//construcores
	public Docente () {	
	}

	public Docente(@NotNull Integer id, @NotNull(message = "campo requerido") String nombre, Especialidad especialidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.especialidad = especialidad;
	}
	//Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}
	
}
