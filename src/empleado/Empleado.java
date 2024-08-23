/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empleado;

/**
 *
 * @author perez
 */
// Clase principal para probar la funcionalidad

abstract class Empleado {
    // Atributos
    protected String nombre;
    protected String id;
    protected double salarioBase;

    // Constructor
    public Empleado(String nombre, String id, double salarioBase) {
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    // Método abstracto para calcular el salario
    public abstract double calcularSalario();

    // Método concreto para mostrar la información básica del empleado
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Salario Base: Q" + salarioBase);
    }
}
