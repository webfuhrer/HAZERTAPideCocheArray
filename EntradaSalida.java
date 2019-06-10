/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionarioarray;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
class EntradaSalida {
   static Coche obtenerDatosCoche()
   {
       String marca=obtenerMarca();
       String modelo=obtenerModelo();
       int potencia=obtenerPotencia();
       int numero_plazas=obtenerPlazas();
       Coche c=new Coche(marca, modelo, potencia, numero_plazas);
       return c;
   }
           
    static String obtenerMarca() {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca la marca del vehículo");
        String marca=sc.nextLine();
        return marca;
    }

    static String obtenerModelo() {
       Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el modelo del vehículo");
        String modelo=sc.nextLine();
        return modelo; 
    }

    static int obtenerPotencia() {
        int potencia=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca la potencia");
         potencia=sc.nextInt();
        return potencia; 
    }

    static int obtenerPlazas() {
        int plazas=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el número de plazas");
         plazas=sc.nextInt();
        return plazas; 
    }
        
    }
    

