/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg2.enunciado.pkg2;

/**
 *
 * @author Elian
 */
public class persona {
 //Constantes
    private static final char SEXO_POR_DEFECTO = 'H';
    public static final int BAJO_PESO = -1;
    public static final int PESO_IDEAL = 0;
    public static final int SOBREPESO = 1;
    
    //Atributos
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso; //en kg
    private double altura; // en metros
    
    
    //Constructores
    public persona(){
        this.nombre = "";
        this.edad = 0;
        this.dni = "";
        this.sexo = SEXO_POR_DEFECTO;
        this.peso = 0;
        this.altura = 0;
    }
    
    public persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }
    
    public persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.dni = "";
        this.peso = 0.0;
        this.altura = 0.0;
    }

    // Métodos
    public int calcularIMC() {
        if (altura <= 0) return PESO_IDEAL; // evitar división por cero

        double imc = peso / (altura * altura);
        if (imc < 20) {
            return BAJO_PESO;
        } else if (imc >= 20 && imc <= 25) {
            return PESO_IDEAL;
        } else {
            return SOBREPESO;
        }
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    private char comprobarSexo(char sexo) {
        if (sexo == 'H' || sexo == 'M') {
            return sexo;
        }
        return SEXO_POR_DEFECTO;
    }

    // Metodos sets
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // toString
    @Override
    public String toString() {
        return "Persona{" +
                "nombre = ' " + nombre + '\'' +
                ", edad = " + edad +
                ", dni= ' " + dni + '\'' +
                ", sexo= " + sexo +
                ", peso = " + peso +
                ", altura = " + altura +
                '}';
    } 
}
