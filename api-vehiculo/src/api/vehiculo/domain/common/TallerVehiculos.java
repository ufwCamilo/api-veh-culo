/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package api.vehiculo.domain.common;

import api.vehiculo.domain.services.AccionRuta;
import api.vehiculo.model.Carro;
import api.vehiculo.model.Moto;
import java.util.Scanner;

/**
 *
 * @author jgcam
 */
public class TallerVehiculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear carro con entrada del usuario
        System.out.println("Ingrese los detalles del carro:");
        Carro carro = crearCarroDesdeEntrada(scanner);

        // Crear moto con entrada del usuario
        System.out.println("\nIngrese los detalles de la moto:");
        Moto moto = crearMotoDesdeEntrada(scanner);

        // Crear instancias de acciones de ruta
        AccionRuta accionesCarro = new AccionRuta(carro);
        AccionRuta accionesMoto = new AccionRuta(moto);

        // Realizar acciones de ruta
        System.out.println("\nAcciones de ruta para el carro:");
        accionesCarro.acelerar();
        accionesCarro.frenar();
        accionesCarro.estacionar();
        accionesCarro.cambiarDireccion("Derecha");

        System.out.println("\nAcciones de ruta para la moto:");
        accionesMoto.acelerar();
        accionesMoto.frenar();
        accionesMoto.estacionar();
        accionesMoto.cambiarDireccion("Izquierda");

        // Cerrar el scanner
        scanner.close();
    }

    private static Carro crearCarroDesdeEntrada(Scanner scanner) {
        System.out.print("Marca: ");
        String marcaCarro = scanner.nextLine();
        System.out.print("Modelo: ");
        String modeloCarro = scanner.nextLine();
        System.out.print("Placa: ");
        String placaCarro = scanner.nextLine();
        System.out.print("Velocidad Máxima: ");
        int velocidadMaximaCarro = Integer.parseInt(scanner.nextLine());
        System.out.print("Cilindraje: ");
        int cilindrajeCarro = Integer.parseInt(scanner.nextLine());
        System.out.print("Tracción Mecánica (true/false): ");
        boolean traccionMecanicaCarro = Boolean.parseBoolean(scanner.nextLine());
        System.out.print("Tracción Automática (true/false): ");
        boolean traccionAutomaticaCarro = Boolean.parseBoolean(scanner.nextLine());

        return new Carro(marcaCarro, modeloCarro, placaCarro, velocidadMaximaCarro, cilindrajeCarro,
                traccionMecanicaCarro, traccionAutomaticaCarro);
    }

    private static Moto crearMotoDesdeEntrada(Scanner scanner) {
        System.out.print("Marca: ");
        String marcaMoto = scanner.nextLine();
        System.out.print("Modelo: ");
        String modeloMoto = scanner.nextLine();
        System.out.print("Placa: ");
        String placaMoto = scanner.nextLine();
        System.out.print("Velocidad Máxima: ");
        int velocidadMaximaMoto = Integer.parseInt(scanner.nextLine());
        System.out.print("Cilindraje: ");
        int cilindrajeMoto = Integer.parseInt(scanner.nextLine());

        return new Moto(marcaMoto, modeloMoto, placaMoto, velocidadMaximaMoto, cilindrajeMoto);
    }
      
}
