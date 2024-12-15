/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package area;

/**
 *
 * @author 50494
 */
import javax.swing.JOptionPane;

class Empleado {
    String nombre;
    double sueldoBase;
    int ventas;

    public Empleado(String nombre, double sueldoBase, int ventas) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
        this.ventas = ventas;
    }

    public double calcularSueldo() {
        return this.sueldoBase * this.ventas / 0.5;
    }

    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "Empleado: " + this.nombre + "\nSueldo Base: $" + this.sueldoBase + "sus ventas fueron: " + this.ventas + "Su cobro tptal es de : " + calcularSueldo());
    }
}


public class Main {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
        double sueldoBase = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo base del empleado:"));
        int ventas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de ventas realizadas:"));
       

        Empleado trabajador =  new Empleado(nombre, sueldoBase, ventas);
        trabajador.mostrarDatos();
    }
}
