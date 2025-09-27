/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.pkg2.enunciado.pkg2;
import java.util.Scanner;
/**
 *
 * @author Elian
 */
public class Lab2Enunciado2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         Scanner scanner = new Scanner(System.in);

        // Pedir datos por teclado
        System.out.print("DNI: ");
        String dni = scanner.nextLine();

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Edad: ");
        int edad = Integer.parseInt(scanner.nextLine());

        System.out.print("Sexo (H/M): ");
        char sexo = scanner.nextLine().charAt(0);

        System.out.print("Peso (kg): ");
        double peso = Double.parseDouble(scanner.nextLine());

        System.out.print("Altura (m): ");
        double altura = Double.parseDouble(scanner.nextLine());

        System.out.println("\n--- Creando personas ---");

        // Persona 1: todos los datos
        persona persona1 = new persona(nombre, edad, dni, sexo, peso, altura);

        // Persona 2: sin peso y altura
        persona persona2 = new persona(nombre, edad + 5 , sexo);
        persona2.setDni(dni + 35); // Agregar el DNI

        // Persona 3: por defecto y luego se usan los sets
        persona persona3 = new persona();
        persona3.setNombre("Marcos");
        persona3.setEdad(25);
        persona3.setDni("60458645");
        persona3.setSexo('n'); // debería corregirse a 'H'
        persona3.setPeso(85);
        persona3.setAltura(1.80);

        // Mostrar información
        mostrarInfo(persona1);
        mostrarInfo(persona2);
        mostrarInfo(persona3);
    }

    private static void mostrarInfo(persona persona) {
        System.out.println("\nInformacion de: " + persona.toString());

    }
    
}
