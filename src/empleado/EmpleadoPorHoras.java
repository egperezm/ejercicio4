/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;

/**
 *
 * @author perez
 */
// Clase concreta EmpleadoPorHoras que extiende de Empleado
class EmpleadoPorHoras extends Empleado {
    private double tarifaPorHora;
    private int horasTrabajadas;

    // Constructor
    public EmpleadoPorHoras(String nombre, String id, double salarioBase, double tarifaPorHora, int horasTrabajadas) {
        super(nombre, id, salarioBase);
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    // Implementación del método abstracto calcularSalario
    @Override
    public double calcularSalario() {
        return horasTrabajadas * tarifaPorHora;
    }

    // Métodos getter y setter para tarifa por hora y horas trabajadas
    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
}
