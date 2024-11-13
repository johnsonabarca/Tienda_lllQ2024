package com.prueba.service;


import com.tienda.domain.Producto;
import java.util.List;


public interface ProductoService {

    public List<Producto> getProductos(boolean activos);
    
    public Producto getProducto(Producto producto);
    
 
    public void save(Producto producto);
    
 
    public void delete(Producto producto); 
    
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);
    
}
