/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PortfolioBackend.PortfolioBackend.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.PortfolioBackend.PortfolioBackend.Model.Skill;
import com.PortfolioBackend.PortfolioBackend.Service.ISkillService;
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
public class ControllerSkill {
    
    @Autowired
    private ISkillService interSkill;
    
    @GetMapping("/hiSkill")
    public String decirHola(){
        return "Hello world skills";
    }
    @GetMapping("/skill")
    public List<Skill> getSkill(){
        return interSkill.getSkill();
    }
    @GetMapping("/skill/{nombre}/{valor}")
    public Long getSkillByAttr(@PathVariable String nombre, @PathVariable String valor){
        return interSkill.getSkillByAttr(nombre, valor);
    }
    @GetMapping("/skill/{id}")
    public Skill getSkillById(@PathVariable Long id){
        return this.interSkill.findSkill(id);
    }
    
    @PutMapping("/skill/editar/{id}")
    public Skill editSkill(@PathVariable Long id,
                                @RequestBody Skill sk){
        
        Skill p = this.interSkill.findSkill(id);
        p.setValor(sk.getValor());
        p.setNombre(sk.getNombre());

        this.interSkill.saveSkill(p);
        return p;

    }
    @PostMapping("/skill/crear")
    public Skill addSkill(@RequestBody Skill sk){
        System.out.println(sk);
        this.interSkill.saveSkill(sk);
        return sk;

    }
    
    @DeleteMapping("/skill/borrar/{id}")
    public Skill deleteSkill(@PathVariable Long id){
       Skill p = this.interSkill.findSkill(id);
       this.interSkill.deleteSkill(id);
       return p;
    }
    
}
