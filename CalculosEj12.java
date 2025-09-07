/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seguimiento1;

public class CalculosEj12 {
    public static double calcularSalarioBruto(int horas, double valorHora) {
        return horas * valorHora;
    }
    public static double calcularRetencion(double salarioBruto) {
        return salarioBruto * 0.125;
    }
    public static double calcularSalarioNeto(double salarioBruto) {
        return salarioBruto - calcularRetencion(salarioBruto);
    }
}
