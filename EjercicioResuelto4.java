/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seguimiento1;

import java.util.Scanner;

public class EjercicioResuelto4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la edad de Juan: ");
        int juan = sc.nextInt();
        System.out.println("Edad de Juan: " + juan);
        System.out.println("Edad de Alberto: " + CalculosEj4.calcularAlberto(juan));
        System.out.println("Edad de Ana: " + CalculosEj4.calcularAna(juan));
        System.out.println("Edad de la mamá: " + CalculosEj4.calcularMama(juan));
        sc.close();
    }
}
