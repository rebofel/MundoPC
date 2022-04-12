package com.gm.mundopc;

public class Orden {
    private int idOrden; 
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 2; 
   
    
public Orden() {
    this.idOrden = ++Orden.contadorOrdenes;     
    this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS]; 
}

public void agregarComputadora(Computadora computadora){
    if (contadorComputadoras < MAX_COMPUTADORAS) {
    this.computadoras[Orden.contadorComputadoras++] = computadora; 
        
    } else {
        System.out.println("Se ha sobrepasado el limite de computadoras " + MAX_COMPUTADORAS);
    }
        
    }
public void mostrarOrden(){
    System.out.println("Id Orden " + idOrden);
    System.out.println("Computadoras agregadas " );
    for (int i = 0; i < computadoras.length; i++) {
        System.out.println(this.computadoras[i]);
        
    }
        
    }

}
    



