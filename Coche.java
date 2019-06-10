package concesionarioarray;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Coche extends Vehiculo{
    private int numero_plazas;

    public Coche(String marca, String modelo, int potencia, int numero_plazas) {
        super(marca, modelo, 4, potencia);
        this.numero_plazas=numero_plazas;
    }

    public int getNumero_plazas() {
        return numero_plazas;
    }

    public void setNumero_plazas(int numero_plazas) {
        this.numero_plazas = numero_plazas;
    }

    @Override
    public String toString() {
        String aux="Marca: "+getMarca()+" Modelo: "+getModelo()+" Potencia: "+getPotencia()+
                " Numero plazas: "+numero_plazas;
        return aux;
    }
    
    
}
