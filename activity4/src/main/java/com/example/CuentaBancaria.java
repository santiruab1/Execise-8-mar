package com.example;

public class CuentaBancaria {

    private String idCuenta;
    private double saldo;
    private String nombreTitular;

    public CuentaBancaria() {
        this.idCuenta = "00000";
        this.saldo = 0.0;
        this.nombreTitular = "Titular sin asignar";
    }

    public CuentaBancaria(String idCuenta, double saldo, String nombreTitular) {
        if (idCuenta != null && !idCuenta.isEmpty()) {
            this.idCuenta = idCuenta;
        } else {
            this.idCuenta = "00000";
        }
        if (saldo >= 0.0) {
            this.saldo = saldo;
        } else {
            this.saldo = 0.0;
        }
        if (nombreTitular != null && !nombreTitular.isEmpty()) {
            this.nombreTitular = nombreTitular;
        } else {
            this.nombreTitular = "Titular sin asignar";
        }
    }

    public String getIdCuenta() {
        return this.idCuenta;
    }

    public void setIdCuenta(String idCuenta) {
        if (idCuenta != null && !idCuenta.isEmpty()) {
            this.idCuenta = idCuenta;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0.0) {
            this.saldo = saldo;
        }
    }

    public String getNombreTitular() {
        return this.nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        if (nombreTitular != null && !nombreTitular.isEmpty()) {
            this.nombreTitular = nombreTitular;
        }
    }

    public void depositar(double cantidadDepositada) {
        if (cantidadDepositada >= 0.0) {
            this.saldo += cantidadDepositada;
        }
    }

}
