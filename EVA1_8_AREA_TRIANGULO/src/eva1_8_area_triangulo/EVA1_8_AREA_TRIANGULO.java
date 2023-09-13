/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_8_area_triangulo;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EVA1_8_AREA_TRIANGULO {

  
    public static void main(String[] args) {
        
        double base; 
        double altura;
        double area;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce la base del triángulo:");
        base = captu.nextDouble();
        System.out.println("Introduce la altura del triángulo:");
        altura = captu.nextDouble();
        area = (base * altura) / 2;
        System.out.println("El área del triángulo es:");
        System.out.println(area);
        
    }
    
}
