/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_9_conversionnes;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_9_CONVERSIONNES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double farenheit, centigrados, kelvin;
        Scanner captu = new Scanner(System.in);
        System.out.println("Temperatura en grados farenheit:");
        farenheit = captu.nextDouble();
        centigrados = (farenheit - 32) / 1.8;
        System.out.println("Grados centigrados =" + centigrados);
        System.out.println("Temperatura en grados centigrados:");
        centigrados = captu.nextDouble();
        farenheit = centigrados * 1.8 + 32;
        System.out.println("Grados farenheit =" + farenheit);
        System.out.println("Temperatura en grados farenheit");
        //CONVERTIR A KELVIN
        System.out.println("Temperatura en grados kelvin:");
        kelvin = captu.nextDouble();
        centigrados = centigrados + 273.15;
        System.out.println("Grados kelvin=" + kelvin);
        System.out.println("Temperatura en grados kelvin");
    }
    
}
