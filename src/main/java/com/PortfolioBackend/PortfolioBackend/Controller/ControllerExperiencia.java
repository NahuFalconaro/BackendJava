/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PortfolioBackend.PortfolioBackend.Controller;

import com.PortfolioBackend.PortfolioBackend.Model.Experiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.PortfolioBackend.PortfolioBackend.Service.IExperienciaService;
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
public class ControllerExperiencia {
    
    @Autowired
    private IExperienciaService interExperiencia;
    
    @GetMapping("/hiExperience")
    public String decirHola(){
        return "Hello world experience";
    }

    @GetMapping("/experiencia")
    public List<Experiencia> getPersonas(){
        return interExperiencia.getExperiencias();
    }
    
    @GetMapping("/experiencia/{titulo}/{descripcion}")
    public Long getExperienciaByAttr(@PathVariable String titulo, @PathVariable String descripcion){
        return interExperiencia.getExperienciaByAttr(titulo, descripcion);
    }
    
    @GetMapping("/experiencia/{id}")
    public Experiencia getExperiencia(@PathVariable Long id){
        return this.interExperiencia.findExperiencia(id);
    }
    
    @PostMapping("/experiencia/crear")
    public Experiencia addExperiencia(@RequestBody Experiencia sk){
        this.interExperiencia.saveExperiencia(sk);
        return sk;
    }
   
    @PutMapping("/experiencia/editar/{id}")
    public Experiencia editExperiencia(@PathVariable Long id,
                                @RequestBody Experiencia sk){
        
        Experiencia p = this.interExperiencia.findExperiencia(id);
        p.setTitulo(sk.getTitulo());
        p.setInicio(sk.getInicio());
        p.setFin(sk.getFin());
        p.setDescripcion(sk.getDescripcion());
        p.setLogo(sk.getLogo());

        this.interExperiencia.saveExperiencia(p);
        return p;

    }
  
    @DeleteMapping("/experiencia/borrar/{id}")
    public Experiencia deleteExperiencia(@PathVariable Long id){
        Experiencia p = this.interExperiencia.findExperiencia(id);
       this.interExperiencia.deleteExperiencia(id);
       return p;
    }
}
