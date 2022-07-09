/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PortfolioBackend.PortfolioBackend.Repository;

import com.PortfolioBackend.PortfolioBackend.Model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nahue
 */
@Repository
public interface SkillRepository extends JpaRepository<Skill, Long>{
    
    @Query("SELECT s FROM Skill s WHERE s.nombre = ?1 and s.valor = ?2 ")
    Skill findByAttr(String user, String valor);
    
}