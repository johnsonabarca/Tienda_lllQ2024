/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.service.impl;

import com.prueba.dao.CategoriaDao;
import com.prueba.domain.Categoria;
import com.prueba.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CategoriaServiceImpl implements CategoriaService {
    @Autowired
    private CategoriaDao categoriaDao;
            
    @Override
    public List<Categoria> getCategorias(boolean activos) {
       List<Categoria> lista = categoriaDao.findAll();
       if(activos){
         lista.removeIf(e -> !e.isActivo());
       }
       return lista;
    }
    
}
