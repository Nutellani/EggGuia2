/*
2. Declarar una clase llamada Circunferencia que tenga como atributo privado el radio 
de tipo real. A continuación, se deben crear los siguientes métodos: 
a) Método constructor que inicialice el radio pasado como parámetro. 
b) Métodos get y set para el atributo radio de la clase Circunferencia. 
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo 
del objeto. 
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio ). 
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio). 
 */

package ej2;

import java.util.Scanner;

public class Ej2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese valor del radio brou");
        double radio = sc.nextDouble();
        Circunferencia circunferencia = new Circunferencia(radio);
        
        System.out.println("\nSu área es: " + circunferencia.calculateArea() +
        " y su perímetro es: " + circunferencia.calculatePerimeter());
        
        
    }
    
}
