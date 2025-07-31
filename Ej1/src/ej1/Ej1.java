/*
1. Crear una clase llamada Book que contenga los siguientes atributos: ISBN, Título, 
Autor, Número de páginas, y un constructor con todos los atributos pasados por 
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los 
datos al usuario y luego informar mediante otro método el número de ISBN, el título, 
el autor del libro y el numero de páginas. 
*/

package ej1;

import java.util.Scanner;
import entities.Book;

public class Ej1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Book book1 = new Book();
        
        book1 = new Book();
        
        System.out.println("Ingrese su numero ISBN");
        book1.setISBN(sc.nextInt());
        System.out.println("Ingrese su numero título");
        book1.setTitle(sc.next());
        System.out.println("Ingrese su autor");
        book1.setAuthor(sc.next());
        System.out.println("Ingrese cantidad de paginas");
        book1.setPages(sc.nextInt());
        
        System.out.println("\n--------------\n");
        
       System.out.println("ISBN: " + book1.getISBN());
        System.out.println("Título: " + book1.getTitle());
        System.out.println("Autor: " + book1.getAuthor());
        System.out.println("Núm de páginas: " +book1.getPages());
        
    }
    
}
