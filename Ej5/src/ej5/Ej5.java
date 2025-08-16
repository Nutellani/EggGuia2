/*
5. Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los 
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo
actual. Las operaciones asociadas a dicha clase son:  
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés. 
• Agregar los métodos getters y setters correspondientes  
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario. 
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a  
ingresar y se la sumara a saldo actual. 
• Método retirar(double retiro): el método recibe una cantidad de dinero a
retirar y se la restará al saldo actual. Si la cuenta no tiene la cantidad de
dinero a retirar, se pondrá el saldo actual en 0.  
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar 
que el usuario no saque más del 20%. 
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.  
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package ej5;

import java.util.Scanner;

public class Ej5 {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        Cuenta cuenta = createAccount();
        
        addCash(cuenta);
    }

    private static Cuenta createAccount(){
        
        System.out.println("Ingrese Numero de cuenta a ingresar ");
        int numeroCuenta = sc.nextInt();
        
        System.out.println("Ahora ingrese su DNI pls :) ");
        long DNI = sc.nextLong();
        
        System.out.println("Por ultimo le pedimos su saldo actual ");
        double saldoActual = sc.nextDouble();
        
        return new Cuenta(numeroCuenta, DNI, saldoActual);
    }
    
    private static void addCash(Cuenta cuenta){
        
        double saldoASumar = sc.nextDouble();
        System.out.println("Ahora ingrese el monto a aumentar");
        cuenta.addCash(saldoASumar);
        System.out.println("Monto aumentado a: " + cuenta.getSaldoActual());
    }
}
