/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundopc;
import com.gm.mundopc.*;

/**
 *
 * @author admin
 */
public class MundoPC {
    public static void main(String[] args) {
    Monitor monitorLG = new Monitor("LG", 32.00); 
    Teclado tecladoGenius = new Teclado("USB", "Genius");
    Raton ratonOne = new Raton("Bluetooth", "One"); 
    Teclado tecladoSamsung = new Teclado("Bluetooth", "Samsung");
    Monitor monitorCrucial = new Monitor("Crucial", 21.00); 
    Computadora computadora1 = new Computadora("PC Gamer", monitorLG, tecladoGenius, ratonOne);
    Computadora computadora2 = new Computadora("PC Estudio", monitorCrucial, tecladoSamsung, ratonOne); 
    Orden orden1 = new Orden(); 
    orden1.agregarComputadora(computadora1);
    orden1.agregarComputadora(computadora2);
    orden1.mostrarOrden();
    
    }
    
}
