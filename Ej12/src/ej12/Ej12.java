/*
12. Implemente la clase Persona. Una persona tiene un nombre y una fecha de 
nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los 
siguientes métodos:  
Nota: encontraras un ejemplo descargable de un Date como atributo en Moodle. 
• Agregar un método de creación del objeto que respete la siguiente firma: 
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta 
al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos 
que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto. 
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. 
Tener en cuenta que para conocer la edad de la persona también se debe 
conocer la fecha actual. 
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro 
otra edad y retorna true en caso de que el receptor tenga menor edad que la 
persona que se recibe como parámetro, o false en caso contrario. 
• Metodo mostrarPersona(): este método muestra la persona creada en el método 
anterior.
 */
package ej12;

import java.util.Date;
import java.util.Scanner;

public class Ej12 {

    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        Persona persona1 = creatingPersona();
        youngerThan(persona1);
        showPersona(persona1);
        
        
    }

    private static Persona creatingPersona() {

        System.out.print("Ingrese su nombre chikitin xfa :) ");
        String nombre = sc.next();

        Date fechaNacimiento = insertDate();
        System.out.println(fechaNacimiento.getDate() + " del " + (fechaNacimiento.getMonth() + 1) + " del año " + (fechaNacimiento.getYear() + 1900));

        return new Persona(nombre, fechaNacimiento);
    }

    private static Date insertDate() {

        System.out.print("Ingrese su AÑO de nacimiento ");
        int year = sc.nextInt() - 1900;
        System.out.print("Su MES de nacimiento (1 = ENERO, 2 = FEBRERO, etc) ");
        int month = sc.nextInt() - 1;
        System.out.print("Y su día pls :) ");
        int day = sc.nextInt();

        return new Date(year, month, day);
    }
    
    private static void youngerThan(Persona persona){
        
        System.out.print("Ingrese otra edada a comparar");
        int age = sc.nextInt();
        
        if(persona.youngerThan(age)){
            System.out.println(persona.getNombre() + " es menor que " + age + " años");
            return;
        }
        
        System.out.println(persona.getNombre() + " es mayor que " + age + " años");
    }
    
    private static void showPersona(Persona persona){
        System.out.println("Nombre: " + persona.getNombre());
        persona.tellAge();
    }

}
