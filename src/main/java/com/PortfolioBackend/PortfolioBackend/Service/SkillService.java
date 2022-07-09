/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PortfolioBackend.PortfolioBackend.Service;

import com.PortfolioBackend.PortfolioBackend.Model.Skill;
import com.PortfolioBackend.PortfolioBackend.Repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nahue
 */
@Service
public class SkillService implements ISkillService{
    
    @Autowired
    private SkillRepository skillRepository;
    
    @Override
    public List<Skill> getSkill() {
        List<Skill> listSkill = this.skillRepository.findAll();
        return listSkill;
    }
    @Override
    public void saveSkill(Skill sk) {
        this.skillRepository.save(sk);
    }

    @Override
    public void deleteSkill(Long id) {
        this.skillRepository.deleteById(id);
    }

    @Override
    public Skill findSkill(Long id) {
        Skill sk = this.skillRepository.findById(id).orElse(null);
        return sk;
    }

    @Override
    public Long getSkillByAttr(String nombre, String valor) {
        Skill sk = this.skillRepository.findByAttr(nombre, valor);
        return sk.getId();
    }
    
   
}