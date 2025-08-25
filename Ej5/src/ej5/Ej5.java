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
        retireCash(cuenta);
        fastRetireCash(cuenta); // "extraccion rapida"
        consultarSaldo(cuenta);
        consultarDatos(cuenta);
        
    }

    private static Cuenta createAccount() {

        System.out.println("Ingrese Numero de su cuenta a ingresar ");
        int numeroCuenta = sc.nextInt();

        System.out.println("Ahora ingrese su DNI pls :) ");
        long DNI = sc.nextLong();

        System.out.println("Por ultimo le pedimos su saldo actual ");
        double saldoActual = sc.nextDouble();

        return new Cuenta(numeroCuenta, DNI, saldoActual);
    }

    private static void addCash(Cuenta cuenta) {

        System.out.println("Ahora ingrese el monto a aumentar");
        double saldoASumar = sc.nextDouble();
        cuenta.addCash(cuenta, saldoASumar);
        System.out.println("Monto aumentado a: " + cuenta.getSaldoActual());
    }

    private static void retireCash(Cuenta cuenta) {

        System.out.println("Ahora ingrese el monto a retirar");
        double saldoARestar = sc.nextDouble();
        
        System.out.println("El verifyCash(cuenta, saldoARestar) salió: " + (verifyCash(cuenta, saldoARestar)));
        if (verifyCash(cuenta, saldoARestar)) {
            cuenta.retireCash(cuenta, saldoARestar);
            System.out.println("Monto restante es de: " + cuenta.getSaldoActual());
        } else {
            System.out.println("Monto a retirar mayor que el saldo lel");
        }
    }

    private static boolean verifyCash(Cuenta cuenta, double saldoARestar) {
        return saldoARestar < cuenta.getSaldoActual();
    }
    
    private static void fastRetireCash(Cuenta cuenta){
        System.out.println("EXTRACCIÓN RÁPIDA: Cuanto desea retirar?? ");
        double saldoARestar = sc.nextDouble();
        if (saldoARestar > (cuenta.getSaldoActual()*0.2)) {
            System.out.println("No puede retirar mas del 20 %");
            return ;
        }
        
        cuenta.setSaldoActual(cuenta.getSaldoActual()-saldoARestar);
        System.out.println("Saldo retirado: " + saldoARestar + ", saldo restante: " + cuenta.getSaldoActual());
    }
    
    private static void consultarSaldo(Cuenta cuenta){
        System.out.println("SUS saldo actual ess de: " + cuenta.getSaldoActual());
    }
    
    private static void consultarDatos(Cuenta cuenta){
        System.out.println("Numero de la cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("DNI de la cuenta: " + cuenta.getDNI());
        System.out.println("Saldo FINAL de la cuenta: " + cuenta.getSaldoActual());
        System.out.println(":)");
    }
}
