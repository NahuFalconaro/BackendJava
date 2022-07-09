/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PortfolioBackend.PortfolioBackend.Controller;

import com.PortfolioBackend.PortfolioBackend.Model.Usuario;
import com.PortfolioBackend.PortfolioBackend.Service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nahue
 */
@RestController
@CrossOrigin(origins = {"http://localhost:4200", "https://porfolio-argprograma.web.app"})
public class ControllerUsuario {
    
    @Autowired
    private IUsuarioService interUser;
    
    
    @PostMapping("/role")
    public Boolean isAdmin(@RequestBody Usuario u){
        String retorno = "admin";
        String isAdmin = this.interUser.findUserByRol(u);
        isAdmin = isAdmin.toLowerCase();
        return (retorno.equals(isAdmin));
    }
    
    @PostMapping("/auth")
    public Boolean Auth(@RequestBody Usuario user){
        Usuario u = this.interUser.findUser(user.getUser());
        Boolean passIgual = this.checkPass(user.getPass(), u.getPass());
        Boolean userNameIgual = this.checkUsername(user.getUser(), u.getUser());
        return (userNameIgual && passIgual);
    }
    
    public Boolean checkPass(String pass1, String pass2){
        return (pass1.equals(pass2));
    }
     public Boolean checkUsername(String user1, String user2){
        return (user1.equals(user2));
    }
}
