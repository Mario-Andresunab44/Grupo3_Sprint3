package com.papeleria.apiPapeleria.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.papeleria.apiPapeleria.modelos.ProductoEntidad;

@Repository
public interface IProductoRepositorio extends CrudRepository<ProductoEntidad, Long>{
    

}
