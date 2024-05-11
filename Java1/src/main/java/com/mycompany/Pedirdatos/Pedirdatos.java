package com.mycompany.Pedirdatos;       

import java.util.Scanner;

public class Pedirdatos {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
               
        System.out.print("ingrese su nombre");
        String nombre = sc.nextLine();
        System.out.print("ingrese su apellido");
        String apellido = sc.next();
        System.out.print("ingrese su edad");
        int edad = sc.nextInt();
        System.out.print("ingrese su telefono");
        String telefono = sc.next();
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("edad " + edad);
        System.out.println("telefono " + telefono);
        
    }
}
