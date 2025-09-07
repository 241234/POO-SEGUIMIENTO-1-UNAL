/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seguimiento1;

import java.util.Scanner;

public class EjercicioPropuesto17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el radio del círculo: ");
        double radio = sc.nextDouble();
        System.out.println("Área del círculo: " + CalculosEj17.calcularArea(radio));
        System.out.println("Longitud de la circunferencia: " + CalculosEj17.calcularLongitud(radio));
        sc.close();
    }
}
