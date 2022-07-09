/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PortfolioBackend.PortfolioBackend.Controller;

import com.PortfolioBackend.PortfolioBackend.Model.Educacion;
import com.PortfolioBackend.PortfolioBackend.Model.Experiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.PortfolioBackend.PortfolioBackend.Service.IEducacionService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author Nahue
 */
@RestController
@CrossOrigin(origins = {"http://localhost:4200", "https://porfolio-argprograma.web.app"})
public class ControllerEducacion {
    
    @Autowired
    private IEducacionService interEducacion;
    
    @GetMapping("/hiEducacion")
    public String decirHola(){
        return "Hello world educacion";
    }

    @GetMapping("/educacion")
    public List<Educacion> getPersonas(){
        return interEducacion.getEducacion();
    }
        
    @GetMapping("/educacion/{id}")
    public Educacion getEducacion(@PathVariable Long id){
        return this.interEducacion.findEducacion(id);
    }
    @GetMapping("/educacion/{titulo}/{descripcion}")
    public Long getEducacionByAttr(@PathVariable String titulo, @PathVariable String descripcion){
        return interEducacion.getEducacionByAttr(titulo, descripcion);
    }
    @PostMapping("/educacion/crear")
    public Educacion addEducacion(@RequestBody Educacion sk){
        this.interEducacion.saveEducacion(sk);
        return sk;

    }

    @PutMapping("/educacion/editar/{id}")
    public Educacion editEducacion(@PathVariable Long id,
                                @RequestBody Experiencia sk){
        
        Educacion p = this.interEducacion.findEducacion(id);
        p.setTitulo(sk.getTitulo());
        p.setInicio(sk.getInicio());
        p.setFin(sk.getFin());
        p.setDescripcion(sk.getDescripcion());
        p.setLogo(sk.getLogo());

        this.interEducacion.saveEducacion(p);
        return p;

    }

    @DeleteMapping("/educacion/borrar/{id}")
    public Educacion deleteEducacion(@PathVariable Long id){
        Educacion p = this.interEducacion.findEducacion(id);
       this.interEducacion.deleteEducacion(id);
       return p;
    }
}