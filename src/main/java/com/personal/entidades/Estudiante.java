package com.personal.entidades;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import org.springframework.lang.NonNull;
import com.sun.istack.Nullable;

@Entity
@Table(name = "estudiantes")
public class Estudiante {

	@Id
	@NonNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank(message = "campo requerido")
	private String nombre;
	
	@Nullable
	private String direccion;
	
	
	@NotNull(message = "campo requerido")
	private Integer edad;

	//constructores
	public Estudiante() {
		
	}

	public Estudiante(Integer id, @NotBlank(message = "campo requerido") String nombre, String direccion,
			@NotNull(message = "campo requerido") Integer edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.edad = edad;
	}

	//Setters and Getters
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
}
