/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_entrada_salida;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EVA1_5_ENTRADA_SALIDA {

    
    public static void main(String[] args) {
     
        //1. DECLARACION DE VARIABLES
        String nombre;
        String apellidos;
        int semestre;
        Scanner capturota = new Scanner(System.in);
        //; FIN DE INSTRUCCIONES EN JAVA
        //2. CAPTURA DE VARIABLES
        System.out.println("Introduce tus nombres:");
        nombre = capturota.nextLine();
        System.out.println("Introduce tus apellidos:");
        apellidos = capturota.nextLine();
        System.out.println("Introduce tu semestre:");
        semestre = capturota.nextInt();
        //Java es sensible a mayúsculas y minúsculas
        //Es decir: es diferente System a system
        //3. MOSTRAR LOS DATOS CAPTURADOS
        System.out.println(nombre);
        System.out.println(apellidos);
        System.out.println(semestre);
        
    }
    
}
