/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PortfolioBackend.PortfolioBackend.Service;

import com.PortfolioBackend.PortfolioBackend.Model.Usuario;
import com.PortfolioBackend.PortfolioBackend.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nahue
 */
@Service
public class UsuarioService implements IUsuarioService{
    
    @Autowired
    private UsuarioRepository userRepository;
    
    
    @Override
    public Usuario findUser(String user) {  
        Usuario sk = this.userRepository.findByName(user);
        return sk;
    }

    @Override
    public String findUserByRol(Usuario user) {
       Usuario sk = this.userRepository.findByName(user.getUser());
       if(sk != null){
           return sk.getRol();
       }
        return "noAdmin";
    }

    
}
