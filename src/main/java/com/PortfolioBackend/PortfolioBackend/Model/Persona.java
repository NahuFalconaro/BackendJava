/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PortfolioBackend.PortfolioBackend.Model;

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
public class Persona {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String nacimiento;
    private String nacionalidad;
    private String mail;
    private String descripcion;
    private String ocupacion;
    private String banner;
    private String profile;

    public Persona() {
    }

    public Persona(
            Long id, 
            String nombre, 
            String apellido,
            String nacimiento, 
            String nacionalidad, 
            String mail, 
            String descripcion, 
            String ocupacion, 
            String banner, 
            String profile
            )
            {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.nacionalidad = nacionalidad;
        this.mail = mail;
        this.descripcion = descripcion;
        this.ocupacion = ocupacion;
        this.banner = banner;
        this.profile = profile;
             }

}
