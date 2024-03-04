/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api.vehiculo.model;

/**
 *
 * @author jgcam
 */
public class Moto implements Vehiculo {
    private String marca;
    private String modelo;
    private String placa;
    private int velocidadMaxima;
    private int cilindraje;
    private boolean traccionMecanica;
    private boolean traccionAutomatica;

    public Moto(String marca, String modelo, String placa, int velocidadMaxima, int cilindraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.velocidadMaxima = velocidadMaxima;
        this.cilindraje = cilindraje;
        this.traccionMecanica = traccionMecanica;
        this.traccionAutomatica = traccionAutomatica;
    }

    // Implementación de métodos de la interfaz Vehiculo
    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    @Override
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public int getCilindraje() {
        return cilindraje;
    }

    @Override
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public boolean isTraccionMecanica() {
        return traccionMecanica;
    }

    @Override
    public void setTraccionMecanica(boolean traccionMecanica) {
        this.traccionMecanica = traccionMecanica;
    }

    @Override
    public boolean isTraccionAutomatica() {
        return traccionAutomatica;
    }

    @Override
    public void setTraccionAutomatica(boolean traccionAutomatica) {
        this.traccionAutomatica = traccionAutomatica;
    }
}
