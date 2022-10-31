package com.papeleria.apiPapeleria.modelos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity(name = "producto")
public class ProductoEntidad implements Serializable{
    
    private static final long serialVersionUID= 1L;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String idProducto;

    @Column(nullable = false)
    private String nombre;
    
    @Column(nullable = false)
    private int precio;

    
    @Column(nullable = false)
    private boolean estado;


    public static long getSerialversionuid() {
        return serialVersionUID;
    }


    public long getId() {
        return id;
    }


    public String getIdProducto() {
        return idProducto;
    }


    public String getNombre() {
        return nombre;
    }


    public int getPrecio() {
        return precio;
    }


    public boolean isEstado() {
        return estado;
    }


    public void setId(long id) {
        this.id = id;
    }


    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setPrecio(int precio) {
        this.precio = precio;
    }


    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
}
