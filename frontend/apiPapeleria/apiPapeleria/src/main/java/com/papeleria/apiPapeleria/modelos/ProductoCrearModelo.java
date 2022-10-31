package com.papeleria.apiPapeleria.modelos;

public class ProductoCrearModelo {

    private String idProducto;
    private String nombre;
    private int precio;
    
    public String getIdProducto() {
        return idProducto;
    }
    public String getNombre() {
        return nombre;
    }
    public int getPrecio() {
        return precio;
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

}
