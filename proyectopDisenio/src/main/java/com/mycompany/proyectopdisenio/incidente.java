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
public class incidente extends agenteSoporte implements incidenteEscalable{
    
    public String descripcion;
    public estadoIncidente estado;
    public Date fechaReporte;
    public prioridadIncidente prioridad;
    
            
            
    public incidente(int id, String nombre,estadoIncidente estado,Date fechaReporte,prioridadIncidente prioridad) {
        super(id, nombre);
        this.descripcion= descripcion;
        this.estado= estado;
        this.fechaReporte= fechaReporte ;
        this.prioridad=prioridad;
    }
    
}
