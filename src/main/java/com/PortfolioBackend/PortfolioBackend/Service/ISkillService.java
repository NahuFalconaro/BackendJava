/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PortfolioBackend.PortfolioBackend.Service;

import com.PortfolioBackend.PortfolioBackend.Model.Skill;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nahue
 */
@Service
public interface ISkillService {
        public List<Skill> getSkill();
        public Skill findSkill(Long id);
        public void saveSkill(Skill sk);
        public void deleteSkill(Long id);
        public Long getSkillByAttr(String nombre, String valor);
}
