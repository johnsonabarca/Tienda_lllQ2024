package com.prueba.service;

import com.tienda.domain.Usuario;
import jakarta.mail.MessagingException;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

public interface RegistroService {
    
    // sirve para el pre-registro
    public Model activar(Model model, String usuario, String clave);
    
    public Model crearUsuario(Model model, Usuario usuario) throws MessagingException;
    
    //completar el proceso de activacion
    public void activar(Usuario usuario, MultipartFile imagenFile);
    
    public Model recordarUsuario(Model model, Usuario usuario) throws MessagingException;
}