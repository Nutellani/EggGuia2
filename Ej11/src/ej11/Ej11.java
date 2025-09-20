/*
11. Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con 
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la 
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le 
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha 
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la 
fecha actual, que se puede conseguir instanciando un objeto Date con constructor 
vacío.  
Ejemplo fecha: Date fecha = new Date(anio, mes, dia); 
Ejemplo fecha actual: Date fechaActual = new Date(); 
Si necesiten acá tienen más información en clase Date: Documentacion Oracle
 */
package ej11;

import java.util.Date;
import java.util.Scanner;

public class Ej11 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Date today = new Date();
        showToday(today);
//        System.out.println(today.getDate()); // muestra la fecha "completa"
//        System.out.println(today.getDay()); // no se, A AVERIGUAR
//        System.out.println(today.getMonth() + 1); // muestra 0 = enero, 1 = feb, etc...
//        System.out.println(today.getYear() + 1900); // muestra la diferencia entre el 1900 hasta hoy
        Date dateToCompare = instanceAnotherDate();
        differencesBetweenDates(today, dateToCompare);
    }

    private static Date instanceAnotherDate() {
        System.out.print("Que dia desea comparar con el de hoy chikitin?? ");
        int dia = sc.nextInt();
        System.out.print("Que mes? ");
        int mes = sc.nextInt() + 1;
        System.out.print("Y de que año?? ");
        int anio = sc.nextInt() + 1900;

        return new Date(anio, mes, dia);
    }

    private static void showToday(Date today) {
        System.out.println("Uste mi estimado/a está en el dia " + today);
    }

    private static void differencesBetweenDates(Date today, Date dateToCompare) {

        System.out.println("Entre hoy y la fecha elegida hay... " + (today.getYear() + 1900 - dateToCompare.getYear() + 1900) + " años, " + (today.getMonth() + 1 - dateToCompare.getMonth() + 1) + " meses y " + (today.getDate() - dateToCompare.getDate()) + " dias");
    }
}
