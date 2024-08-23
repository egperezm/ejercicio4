/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;

/**
 *
 * @author perez
 */
// Clase concreta EmpleadoAsalariado que extiende de Empleado
class EmpleadoAsalariado extends Empleado {

    // Constructor
    public EmpleadoAsalariado(String nombre, String id, double salarioBase) {
        super(nombre, id, salarioBase);
    }

    // Implementación del método abstracto calcularSalario
    @Override
    public double calcularSalario() {
        return salarioBase;  // El salario mensual es el salario base
    }
}
