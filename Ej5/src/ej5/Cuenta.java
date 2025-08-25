package ej5;

public class Cuenta {
    
    private int numeroCuenta;
    private long DNI;
    private double saldoActual;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long DNI, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    /////    METHODS    /////
    
    public void addCash(Cuenta cuenta, double saldoASumar){
        saldoActual += saldoASumar;
    }
    
    public void retireCash(Cuenta cuenta, double saldoARestar){
        saldoActual -= saldoARestar;
    }
}
