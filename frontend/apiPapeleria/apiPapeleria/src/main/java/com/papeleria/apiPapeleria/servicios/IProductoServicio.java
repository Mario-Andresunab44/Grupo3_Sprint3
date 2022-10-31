package com.papeleria.apiPapeleria.servicios;

import java.util.List;

import com.papeleria.apiPapeleria.modelos.ProductoDto;

public interface IProductoServicio {

    List<ProductoDto> obtenerProductos();

    ProductoDto creaProducto(ProductoDto productoDto);
    
}
