package com.papeleria.apiPapeleria.modelos;

public class ProductoRespuestaModelo {
    
    private String idProducto;
    private String nombre;
    private int precio;
    private boolean estado;
    
    
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
