/*
6. Programa Nespresso. Desarrolle una clase Cafetera con los atributos 
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y 
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente,
al menos, los siguientes métodos:
• Constructor predeterminado o vacío  
• Constructor con la capacidad máxima y la cantidad actual  
• Métodos getters y setters. 
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad 
máxima.   
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe
el tamaño de la taza y simula la acción de servir la taza con la capacidad
indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, se
sirve lo que quede. El método le informará al usuario si se llenó o no la taza,
y de no haberse llenado en cuanto quedó la taza. 
• Método vaciarCafetera(): pone la cantidad de café actual en cero.   
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método
o recibe y se añade a la cafetera la cantidad de café indicada. 
 */
package ej6;

import java.util.Scanner;

public class Ej6 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Cafetera cafetera = crearCafetera();
        llenarTaza(cafetera);
        vaciarCafetera(cafetera);
        agregarCafe(cafetera);
    }

    private static Cafetera crearCafetera() {

        System.out.println("La cafetera numero 3 del Momo tiene una capacidad de 2 litros, "
                + "cuantos mililitros le vas a poner chikitin ???");

        double porLlenar = 0;

        porLlenar = verifyCafetera(porLlenar);

        return new Cafetera(porLlenar);
    }

    private static double verifyCafetera(double porLlenar) {

        do {
            porLlenar = sc.nextDouble();
            if (porLlenar < 0 || porLlenar > Cafetera.CAPACIDAD_MAXIMA) {
                System.out.println("Pero dentro de lo lógico we, tonta la weá, wrc");
            }
        } while (porLlenar < 0 || porLlenar > Cafetera.CAPACIDAD_MAXIMA);

        return porLlenar;
    }

    private static void llenarTaza(Cafetera cafetera) {

        double capacidadTaza;
        System.out.println("De cuanto es su taza ??");

        do {
            capacidadTaza = sc.nextDouble();
            if (capacidadTaza < 0) {
                System.out.println("Pero dentro de lo lógico we, tonta la weá, wrc");
            }
        } while (capacidadTaza < 0);

        boolean tieneSuficiente = capacidadTaza <= cafetera.getCapacidadActual();

        if (!tieneSuficiente) {
            System.out.println("Se llenó la taza con " + cafetera.getCapacidadActual() + " mililitros");
            vaciarCafetera(cafetera);
            return;
        }

        System.out.println("Se llenó la taza con " + capacidadTaza + " mililitros");
        cafetera.setCapacidadActual(cafetera.getCapacidadActual() - capacidadTaza);
    }

    public static void vaciarCafetera(Cafetera cafetera) {

        cafetera.vaciarCafetera();
        System.out.println("Su cafetera se ha vaciado: " + cafetera.getCapacidadActual());
    }

    public static void agregarCafe(Cafetera cafetera) {

        double cafeAgregado;

        System.out.println("Cuanto cafe le agregai chamaco ??");

        do {
            cafeAgregado = sc.nextDouble();
            if (cafeAgregado < 0 || cafeAgregado > Cafetera.CAPACIDAD_MAXIMA) {
                System.out.println("No le entra a la cafetera we UwU");
            }
        } while (cafeAgregado < 0 || cafeAgregado > Cafetera.CAPACIDAD_MAXIMA);

        cafetera.setCapacidadActual(cafeAgregado);
        System.out.println("Capacidad del café disponible: " + cafetera.getCapacidadActual());

    }
}
