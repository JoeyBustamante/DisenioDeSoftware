/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopdisenio;

/**
 *
 * @author joeybustamante
 */
public class politica extends administrador {
    
    public String tipoPolitica;
    public String descripcion;
    
    
    public politica(int id, String nombre,String tipoPolitica,String descripcion) {
        super(id, nombre);
        this.tipoPolitica =tipoPolitica;
        this.descripcion=descripcion;
        
    }
    
}
