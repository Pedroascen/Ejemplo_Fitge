package com.personal.entidades;

import javax.persistence.*;

/**
 * TipoPersona
 */
@Entity
public class TipoPersona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tipo;

    public TipoPersona() {
        super();
    }

    public TipoPersona(Integer id, String tipo) {
        this.id=id;
        this.tipo=tipo;
    }


    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }
    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }
    
}
