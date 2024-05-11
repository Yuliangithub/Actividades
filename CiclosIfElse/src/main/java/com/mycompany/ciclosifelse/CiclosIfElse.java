package com.mycompany.ciclosifelse;

import java.util.Scanner;

public class CiclosIfElse {

    public static void main(String[] args) {
        
      Scanner sc = new Scanner (System.in);
      
      System.out.println("digite un numero");
        int a = sc.nextInt();
        System.out.println("digite otro numero");
        int b = sc.nextInt();
        int suma = a+b;
       

        
        if (suma>0){
            
           // si la condicion se cumple
           
            System.out.println("el numero es positivo "+suma);
        } else {
        
        //la condicon es falsa 
            System.out.println("el numero es negativo "+suma);
       
            
    }
    }}
