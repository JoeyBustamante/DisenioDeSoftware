/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopdisenio;

/**
 *
 * @author joeybustamante
 */
public class habitacion extends Hotel implements reservable {
    public String numero;
    public String tipo;
    public double precioPorNoche;
    public estadoHabitacion estado; 
    public boolean desayunoIncluido;
    public boolean accesoExclusivo;

    public habitacion(int id, String nombre,String direccion,String categoria,String numero, String tipo, double precioPorNoche, estadoHabitacion estado, boolean desayunoIncluido, boolean accesoExclusivo) {
        super(id,nombre,direccion,categoria);
        this.numero = numero;
        this.tipo = tipo;
        this.precioPorNoche = precioPorNoche;
        this.estado = estado;
        this.desayunoIncluido = desayunoIncluido;
        this.accesoExclusivo = accesoExclusivo;
    }
    
}
