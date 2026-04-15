/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller1_4;

/**
 *
 * @author Miguel
 */
public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro();
        Libro libro2 = new Libro("Java Básico", "Juan Pérez", 200);

        CuentaBancaria cuenta1 = new CuentaBancaria();
        CuentaBancaria cuenta2 = new CuentaBancaria("12345", 5000, "Corriente");

        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante("Ana", 20, "Programación");

        libro1.mostrarLibro();
        libro2.mostrarLibro();

        cuenta1.mostrarCuenta();
        cuenta2.mostrarCuenta();

        estudiante1.mostrarEstudiante();
        estudiante2.mostrarEstudiante();

        Coche c1 = new Coche("Toyota", "Corolla");
        Coche c2 = new Coche("Mazda", "3");

        Coche.mostrarCantidad();

        System.out.println("Suma: " + Calculadora.suma(5, 3));
    }
}
