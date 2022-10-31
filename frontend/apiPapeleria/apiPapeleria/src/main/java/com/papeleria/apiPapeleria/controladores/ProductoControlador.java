package com.papeleria.apiPapeleria.controladores;

import javax.print.attribute.standard.Destination;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.papeleria.apiPapeleria.modelos.ProductoCrearModelo;
import com.papeleria.apiPapeleria.modelos.ProductoDto;
import com.papeleria.apiPapeleria.modelos.ProductoRespuestaModelo;
import com.papeleria.apiPapeleria.servicios.IProductoServicio;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;





@RestController
@RequestMapping("/Producto")
public class ProductoControlador {
    
    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IProductoServicio iProductoServicio;

    @GetMapping
    public String obtenerProductos(){
        return "Get Productos";
    }
       
    @PostMapping
    public ProductoRespuestaModelo crearProducto (@RequestBody ProductoCrearModelo productoCrearModelo) {
        
        ProductoDto productoDto= modelMapper.map(productoCrearModelo, ProductoDto.class);

        ProductoDto productoDtoCreado= iProductoServicio.creaProducto(productoDto);

        ProductoRespuestaModelo productoRespuestaModelo= modelMapper.map(productoDtoCreado, ProductoRespuestaModelo.class);


        return productoRespuestaModelo;
    }
    
    @PutMapping
    public String actualizarProdcuto() {

        return "Put Producto";
    }

    @DeleteMapping
    public String deleteProducto(){

        return "Eliminar Producto";
    }
}
