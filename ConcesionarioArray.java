/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionarioarray;

/**
 *
 * @author Admin
 */
public class ConcesionarioArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coche[] lista_coches=new Coche[2];
        for(int i=0; i<lista_coches.length; i++)
        {
           lista_coches[i]=EntradaSalida.obtenerDatosCoche();
        }
        for(int i=0; i<lista_coches.length; i++)
        {
            System.out.println(lista_coches[i]);
        }
    }
    
}
