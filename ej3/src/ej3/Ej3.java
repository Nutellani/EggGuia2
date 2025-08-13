/*
3. Crear una clase llamada Operacion que tenga como atributos privados numero1 y 
numero2. A continuación, se deben crear los siguientes métodos: 
a) Método constructor con todos los atributos pasados por parámetro. 
b) Metodo constructor sin los atributos pasados por parámetro. 
c) Métodos get y set. 
d) Método para crearOperacion(): que le pide al usuario los dos números y los 
guarda en los atributos del objeto. 
e) Método sumar(): calcular la suma de los números y devolver el resultado al main. 
f) Método restar(): calcular la resta de los números y devolver el resultado al main 
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, 
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el 
error. Si no, se hace la multiplicación y se devuelve el resultado al main 
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a 
pasar una división por cero, el método devuelve 0 y se le informa al usuario el 
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado 
al main.
 */
package ej3;

import java.util.Scanner;

public class Ej3 {
    
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        Operation operation1 = crearOperation();
        additionNumbers(operation1);
        restNumbers(operation1);
        multiplyNumbers(operation1);
        divideNumbers(operation1);
    }
    
    private static Operation crearOperation(){
        
        double n1;
        double n2;
        
        System.out.print("Ingrese numero 1: ");
        n1 = sc.nextDouble();
        System.out.println("");
        System.out.print("Ingrese numero 2: ");
        n2 = sc.nextDouble();
        System.out.println("");
        
        return new Operation(n1, n2);
    }
    
    private static void additionNumbers(Operation operation){
        System.out.println(operation.getNumber1() + " + " + operation.getNumber2() + " = " + (operation.getNumber1()+operation.getNumber2()) + "\n");
    }
    
    private static void restNumbers(Operation operation){
        System.out.println(operation.getNumber1() + " - " + operation.getNumber2() + " = " + (operation.getNumber1()-operation.getNumber2()) + "\n");
    }
    
    private static void multiplyNumbers(Operation operation){
        System.out.println(operation.getNumber1() + " * " + operation.getNumber2() + " = " + (operation.getNumber1()*operation.getNumber2()) + "\n");
    }
    
    private static void divideNumbers(Operation operation){
        
        if(operation.number2 == 0){
            System.out.println("Has metido un cero DIAaavlo loco CEVoolla, eso tu no lo pue hacee\n");
            return ;
        }
        
        System.out.println(operation.getNumber1() + " / " + operation.getNumber2() + " = " + (operation.getNumber1()/operation.getNumber2()) + "\n");
        
    }
    
}
