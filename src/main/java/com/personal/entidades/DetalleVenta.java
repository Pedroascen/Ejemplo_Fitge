package com.personal.entidades;

import javax.persistence.*;

@Entity
@Table(name = "detalles_ventas")
public class DetalleVenta {
	//campos de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(cascade = CascadeType.REMOVE,optional = false,fetch = FetchType.EAGER)
    private Venta venta;
   
    @ManyToOne(optional = false,fetch = FetchType.EAGER)
    private Producto producto;
    private Integer cantidad;
    
    //Constructores
    public DetalleVenta() {
    	
    }

	public DetalleVenta(Integer id, Venta venta, Producto producto, Integer cantidad) {
		super();
		this.id = id;
		this.venta = venta;
		this.producto = producto;
		this.cantidad = cantidad;
	}

	//Getter and Getters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
}
