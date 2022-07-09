/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PortfolioBackend.PortfolioBackend.Repository;

import com.PortfolioBackend.PortfolioBackend.Model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nahue
 */
@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, Long>{
    
    @Query("SELECT p FROM Proyecto p WHERE p.nombre = ?1 and p.descripcion = ?2 ")
    Proyecto findByAttr(String titulo, String descrip);
    
}