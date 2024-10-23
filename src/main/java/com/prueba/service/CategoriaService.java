/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.prueba.service;

import com.prueba.domain.Categoria;
import java.util.List;


/**
 *
 * @author ideapad 3
 */
public interface CategoriaService {
    public List<Categoria> getCategorias(boolean activos);
    
    
}
