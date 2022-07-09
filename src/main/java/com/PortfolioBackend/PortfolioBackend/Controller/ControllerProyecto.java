/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PortfolioBackend.PortfolioBackend.Controller;

import com.PortfolioBackend.PortfolioBackend.Model.Proyecto;
import com.PortfolioBackend.PortfolioBackend.Service.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nahue
 */
@RestController
@CrossOrigin(origins = {"http://localhost:4200", "https://porfolio-argprograma.web.app"})
public class ControllerProyecto {
    
    @Autowired
    private IProyectoService interProyecto;
    
    @GetMapping("/hiProyecto")
    public String decirHola(){
        return "Hello world Proyecto";
    }

    @GetMapping("/proyecto")
    public List<Proyecto> getProyecto(){
        return interProyecto.getProyecto();
    }

    @GetMapping("/proyecto/{id}")
    public Proyecto getProyecto(@PathVariable Long id){
        return this.interProyecto.findProyecto(id);
    }
    @GetMapping("/proyecto/{nombre}/{descrip}")
    public Long getProjectByAttr(@PathVariable String nombre, @PathVariable String descrip){
        return interProyecto.getProjectByAttr(nombre, descrip);
    }
    @PostMapping("/proyecto/crear")
    public Proyecto addProyecto(@RequestBody Proyecto sk){
        this.interProyecto.saveProyecto(sk);
        return sk;

    }

    @PutMapping("/proyecto/editar/{id}")
    public Proyecto editProyecto(@PathVariable Long id,
                                @RequestBody Proyecto sk){
        
        Proyecto p = this.interProyecto.findProyecto(id);
        p.setNombre(sk.getNombre());
        p.setDescripcion(sk.getDescripcion());
        p.setRealizacion(sk.getRealizacion());
        p.setLink(sk.getLink());
        this.interProyecto.saveProyecto(p);
        return p;

    }

    @DeleteMapping("/proyecto/borrar/{id}")
    public Proyecto deleteProyecto(@PathVariable Long id){
        Proyecto p = this.interProyecto.findProyecto(id);
       this.interProyecto.deleteProyecto(id);
       return p;
    }
}
