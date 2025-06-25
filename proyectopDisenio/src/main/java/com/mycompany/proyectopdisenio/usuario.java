/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopdisenio;

/**
 *
 * @author joeybustamante
 */
public class usuario extends persona {
    public String email; 
    public String telefono;
    
    
    
    
    public usuario(int id, String nombre,String email, String telefono) {
        super(id, nombre);
        this.email=email;
        this.telefono= telefono;
        
    }
    
    
    
    
}
