/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PortfolioBackend.PortfolioBackend.Model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Nahue
 */
@Getter @Setter @Data
@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String nombre;
    private Date realizacion;
    private String descripcion;
    private String link;

    
    public Proyecto() {
    }
    public Proyecto(Long id,  
            String nombre, 
            Date realizacion,
            String descripcion,
            String link) {
        this.id = id;
        this.nombre = nombre;
        this.realizacion = realizacion;
        this.descripcion = descripcion;
        this.link = link;

    }
}