
package concesionarioarray;

public class Vehiculo {
    private String marca, modelo;
    private int numero_ruedas,potencia;

    public Vehiculo(String marca, String modelo, int numero_ruedas, int potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.numero_ruedas = numero_ruedas;
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumero_ruedas() {
        return numero_ruedas;
    }

    public void setNumero_ruedas(int numero_ruedas) {
        this.numero_ruedas = numero_ruedas;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
}
