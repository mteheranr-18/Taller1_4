/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1_4;

/**
 *
 * @author Miguel
 */
class Estudiante {
    String nombre;
    int edad;
    String curso;

    public Estudiante() {
        this("Sin nombre", 0);
        this.curso = "No asignado";
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad);
        this.curso = curso;
    }

    public void mostrarEstudiante() {
        System.out.println(nombre + ", " + edad + " años, Curso: " + curso);
    }
}