/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seguimiento1;

import java.util.Scanner;

public class EjercicioPropuesto12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de horas trabajadas: ");
        int horas = sc.nextInt();
        System.out.print("Ingrese el valor por hora: ");
        double valorHora = sc.nextDouble();
        double salarioBruto = CalculosEj12.calcularSalarioBruto(horas, valorHora);
        System.out.println("Salario bruto: " + salarioBruto);
        System.out.println("Retención (12.5%): " + CalculosEj12.calcularRetencion(salarioBruto));
        System.out.println("Salario neto: " + CalculosEj12.calcularSalarioNeto(salarioBruto));
        sc.close();
    }
}
