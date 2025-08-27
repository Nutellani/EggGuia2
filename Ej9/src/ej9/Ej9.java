/*
9. Realizar una clase llamada Matemática que tenga como atributos dos números reales 
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener 
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se 
usará el Math.random para generar los dos números y se guardaran en el objeto con 
su respectivos set. Deberá además implementar los siguientes métodos:  
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor 
valor 
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase 
elevado al menor número. Previamente se deben redondear ambos valores. 
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores. 
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package ej9;

import static java.lang.Math.sqrt;

public class Ej9 {

    public static void main(String[] args) {

        Matematica objectMath = Matematica.randomized();
        System.out.println(objectMath.getNumber1() + " y " + objectMath.getNumber2());
        System.out.println("El numero mayor es: " + devolverMayor(objectMath));
        calcularPotencia(objectMath);
        calcularRaiz(objectMath);
    }

    private static Double devolverMayor(Matematica objectMath) {
        return objectMath.getMayor();
    }

    private static void calcularPotencia(Matematica objectMath) {
        System.out.print(objectMath.getMayor() + " elevado a la " + objectMath.getMenor() + " = " + Math.pow(objectMath.getMayor(), objectMath.getMenor()));
        System.out.println("");
    }

    private static void calcularRaiz(Matematica objectMath) {
        System.out.println("La Raiz de " + objectMath.getNumber1() + " es: " + sqrt(objectMath.getNumber1()) );
        System.out.println("Y la Raiz de " + objectMath.getNumber2() + " es: " + sqrt(objectMath.getNumber2()) );
    }
}
