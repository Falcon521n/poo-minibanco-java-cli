package org.ejercicio.banco;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Yair Falcon", 123123);
        CuentaBancaria cuenta1 = new CuentaBancaria(123123,cliente1,10000);
    }
    
}