/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seguimiento1;
public class CalculosEj4 {
    public static int calcularAlberto(int juan) {
        return (juan * 2) / 3;
    }
    public static int calcularAna(int juan) {
        return (juan * 4) / 3;
    }
    public static int calcularMama(int juan) {
        return juan + calcularAlberto(juan) + calcularAna(juan);
    }
}
