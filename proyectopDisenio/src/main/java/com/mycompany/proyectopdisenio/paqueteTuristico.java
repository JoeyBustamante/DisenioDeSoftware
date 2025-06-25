/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopdisenio;

/**
 *
 * @author joeybustamante
 */
public class paqueteTuristico implements reservable{
    public int id;
    public String nombre;
    public double descuento;
    public String serviciosAdicionales;

    public paqueteTuristico(int id, String nombre, double descuento, String serviciosAdicionales) {
        this.id = id;
        this.nombre = nombre;
        this.descuento = descuento;
        this.serviciosAdicionales = serviciosAdicionales;
    }
    
    
    
    
}
