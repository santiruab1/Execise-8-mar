package com.example;

public class Main {
    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria();
        CuentaBancaria cuenta2 = new CuentaBancaria("00002", 23000.12, "Ramon Perez");

        cuenta1.setIdCuenta("00001");
        cuenta1.setSaldo(-12);
        cuenta1.setNombreTitular("Maria Suarez");

        cuenta2.depositar(124583.89);

        System.out.println("Informacion cuenta1:" + cuenta1.getIdCuenta() + "; " + cuenta1.getSaldo() + "; " + cuenta1.getNombreTitular());
        System.out.println("Informacion cuenta2:" + cuenta2.getIdCuenta() + "; " + cuenta2.getSaldo() + "; " + cuenta2.getNombreTitular());

    }
}