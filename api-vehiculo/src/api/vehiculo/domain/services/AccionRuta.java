/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api.vehiculo.domain.services;

import api.vehiculo.model.Vehiculo;

/**
 *
 * @author jgcam
 */
public class AccionRuta {
    Vehiculo vehiculo;

    public AccionRuta(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void acelerar() {
        System.out.println("El vehículo " + vehiculo.getPlaca() + " se ha acelerado.");
    }

    public void frenar() {
        System.out.println("El vehículo " + vehiculo.getPlaca() + " ha frenado.");
    }

    public void estacionar() {
        System.out.println("El vehículo " + vehiculo.getPlaca() + " se ha estacionado.");
    }

    public void cambiarDireccion(String direccion) {
        System.out.println("El vehículo " + vehiculo.getPlaca() + " ha cambiado de dirección a " + direccion + ".");
    }
}
