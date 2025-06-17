package com.equipo.saludotest;

public class App {
    public static String saludar(String nombre){
        return "Hola " + nombre + "!!";
    }
    public static void main(String[] args) {
        System.out.println(saludar("DEVOPS"));
        System.out.print("Hello and welcome!");
    }
}