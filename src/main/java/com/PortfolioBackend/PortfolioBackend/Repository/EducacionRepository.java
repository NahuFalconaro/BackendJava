/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PortfolioBackend.PortfolioBackend.Repository;

import com.PortfolioBackend.PortfolioBackend.Model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nahue
 */
@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Long>{
    
    @Query("SELECT e FROM Educacion e WHERE e.titulo = ?1 and e.descripcion = ?2 ")
    Educacion findByAttr(String titulo, String descripcion);
    
}
