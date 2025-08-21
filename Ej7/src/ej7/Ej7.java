/*
7. Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, 
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún 
otro atributo, puede hacerlo. Los métodos que se implementarán son: 
• Un constructor por defecto. 
• Un constructor con todos los atributos como parámetro. 
• Métodos getters y setters de cada atributo. 
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos 
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto 
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o 
O. Si no es correcto se deberá mostrar un mensaje 
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en 
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa 
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la 
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona 
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la 
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la 
función devuelve un 1.  
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función 
devuelve un booleano. 
A continuación, en la clase main hacer lo siguiente: 
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos 
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, 
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la 
persona es mayor de edad. 
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad 
en distintas variables, para después en el main, calcular un porcentaje de esas 4 
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por 
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y 
cuantos menores.
 */
package ej7;

import java.util.Scanner;

public class Ej7 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Persona persona = crearPersona();

    }

    private static Persona crearPersona() {

        System.out.println("Ingrese su Nombre: ");
        String nombre = sc.nextLine();

        int edad = verifyAge();

        System.out.println("Ingrese su sexo (Hombre o Mujer)");
        char sexo = verifySex();

        System.out.println("Ingrese su masa corporal dea");
        double peso = sc.nextDouble();

        System.out.println("Ingrese su altura");
        double altura = sc.nextDouble();

        return new Persona(nombre, edad, sexo, peso, altura);
    }

    private static int verifyAge() {

        int age = 0;

        do {
            System.out.println("Ingrese su edad");
            age = sc.nextLine().toUpperCase().charAt(0);
            if (!(age < 1 || age > 100)) {
                System.out.println("Menos de cero o mayor q 100 bro?? ");
            }
        } while (!(age == 'H' || age == 'M'));

        return age;
    }

    private static char verifySex() {

        char sex;

        do {
            sex = sc.nextLine().toUpperCase().charAt(0);
            if (!(sex == 'H' || sex == 'M')) {
                System.out.println("Dije Hombre o Mujer bro, no modelo de helicoptero?");
            }
        } while (!(sex == 'H' || sex == 'M'));

        return sex;
    }

}
