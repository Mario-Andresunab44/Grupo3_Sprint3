package com.papeleria.apiPapeleria.modelos;

import java.io.Serializable;

public class ProductoDto implements Serializable{
    
    private static final long serialVersionUID= 1L;

    private long id;
    private String idProducto;
    private String nombre;
    private int precio;
    private boolean estado;

   
    
    public boolean isEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
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
   
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
}
