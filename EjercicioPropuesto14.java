/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seguimiento1;

import java.util.Scanner;

public class EjercicioPropuesto14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();
        System.out.println("El cuadrado de " + numero + " es: " + CalculosEj14.calcularCuadrado(numero));
        System.out.println("El cubo de " + numero + " es: " + CalculosEj14.calcularCubo(numero));
        sc.close();
    }
}
