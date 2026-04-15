/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1_4;

/**
 *
 * @author Miguel
 */
class CuentaBancaria {
    String numeroCuenta;
    double saldo;
    String tipoCuenta;

    public CuentaBancaria() {
        this.numeroCuenta = "0000";
        this.saldo = 0;
        this.tipoCuenta = "Ahorros";
    }

    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0;
    }

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public void mostrarCuenta() {
        System.out.println("Cuenta: " + numeroCuenta + ", Saldo: " + saldo + ", Tipo: " + tipoCuenta);
    }
}