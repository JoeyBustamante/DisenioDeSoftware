/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopdisenio;

import java.util.Date;

/**
 *
 * @author joeybustamante
 */
public class reserva extends usuario{
    public Date fecha;
    public String estado;
    public double montoTotal;
    
    public reserva(int id, String nombre, String email, String telefono,Date fecha,String estado,double montoTotal) {
        super(id, nombre, email, telefono);
        this.fecha=fecha;
        this.estado=estado;
        this.montoTotal=montoTotal;
    }
    
}
