package com.papeleria.apiPapeleria.servicios;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.papeleria.apiPapeleria.controladores.Autowired;
import com.papeleria.apiPapeleria.modelos.ProductoDto;
import com.papeleria.apiPapeleria.modelos.ProductoEntidad;
import com.papeleria.apiPapeleria.repositorios.IProductoRepositorio;

import net.bytebuddy.asm.Advice.Return;

@Service
public class ProductoServicio implements IProductoServicio{

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IProductoRepositorio iProductoRepositorio;

    @Override
    public List<ProductoDto> obtenerProductos() {
        return null;
    }

    @Override
    public ProductoDto creaProducto(ProductoDto productoDto) {
    
        ProductoEntidad productoEntidad= modelMapper.map(productoDto, ProductoEntidad.class);
        productoEntidad.setEstado(true);

        ProductoEntidad productoEntidadCreado= iProductoRepositorio.save(productoEntidad);
        ProductoDto productoDtoCreado= modelMapper.map(productoEntidadCreado, ProductoDto.class);

        return productoDtoCreado; 

    }
    
}
