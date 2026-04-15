/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1_4;

/**
 *
 * @author Miguel
 */
class Coche {
    public String marca;
    public String modelo;
    static int contadorCoches = 0;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }

    public static void mostrarCantidad() {
        System.out.println("Total de coches: " + contadorCoches);
    }
}