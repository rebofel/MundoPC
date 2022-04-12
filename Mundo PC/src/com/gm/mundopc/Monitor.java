
package com.gm.mundopc;

public class Monitor{
    private int idMonitor; 
    private String marca; 
    private Double tamano; 
    private static int contadorMonitores; 
    
    private Monitor() { //Constructor privado para que se inicie la variable idMonitor 
        this.idMonitor = ++Monitor.contadorMonitores; 
    }

    public Monitor(String marca, Double tamano) {
        this();
        this.marca = marca;
        this.tamano = tamano;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getTamano() {
        return tamano;
    }

    public void setTamano(Double tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamano=" + tamano + '}';
    }
    
    
}

    