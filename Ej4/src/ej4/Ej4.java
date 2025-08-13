/*
4. Crear una clase Rectángulo que modele rectángulos por medio de un atributo 
privado base y un atributo privado altura. La clase incluirá un método para crear el 
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un 
método para calcular la superficie del rectángulo y un método para calcular el 
perímetro del rectángulo. Por último, tendremos un método que dibujará el 
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir 
los métodos getters, setters y constructores correspondientes. 
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package ej4;

import java.util.Scanner;

public class Ej4 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Rectangle rectangle1 = createRectangle();
        surface(rectangle1);
        perimeter(rectangle1);
        showRectangle(rectangle1);
    }

    private static Rectangle createRectangle() {

        System.out.print("Ingrese la base chikitin... ");
        int base = sc.nextInt();
        System.out.print("Ingrese la altura ahrita :) ");
        int height = sc.nextInt();

        return new Rectangle(base, height);
    }

    private static void surface(Rectangle rectangle) {
        System.out.println("\nSu superficie es de: " + (rectangle.getBase() * rectangle.getHeight()));
    }

    private static void perimeter(Rectangle rectangle) {
        double perimeterResult = rectangle.getBase() + rectangle.getHeight() * 2 ; 
        System.out.println("\nSu permietro es de: " + perimeterResult);
        System.out.println("");
    }

    private static void showRectangle(Rectangle rectangle) {
        
        showBase(rectangle);
        showMiddleRectangle(rectangle);
        showBase(rectangle);
        System.out.println("");
    }

    private static void showBase(Rectangle rectangle) {

        for (int i = 0; i < rectangle.getBase(); i++) {
            System.out.print("* ");
        }
        System.out.println("");
    }

    private static void showMiddleRectangle(Rectangle rectangle) {

        for (int i = 1; i < rectangle.getHeight()-1; i++) {
            System.out.print("*");
            
            for (int j = 1; j < rectangle.getBase() - 1; j++) {
                System.out.print("  ");
            }
            System.out.println(" *");
        }
    }
}
