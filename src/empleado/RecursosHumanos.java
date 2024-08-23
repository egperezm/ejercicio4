/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;

/**
 *
 * @author perez
 */
// Clase principal para probar la funcionalidad
public class RecursosHumanos {
    public static void main(String[] args) {
        // Crear un empleado asalariado
        EmpleadoAsalariado empleado1 = new EmpleadoAsalariado("=Elder Benito", "info01", 3000.0);
        empleado1.mostrarInformacion();
        System.out.println("Salario Mensual: Q " + empleado1.calcularSalario());
        System.out.println();

        // Crear un empleado por horas
        EmpleadoPorHoras empleado2 = new EmpleadoPorHoras("Byron Pescado", "info02", 0, 5, 111);
        empleado2.mostrarInformacion();
        System.out.println("Salario Mensual: Q" + empleado2.calcularSalario());
    }
}
