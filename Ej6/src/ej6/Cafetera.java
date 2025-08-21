package ej6;

public class Cafetera {

    public static final double CAPACIDAD_MAXIMA = 2000;// mililitros
    private double capacidadMaxima = CAPACIDAD_MAXIMA; 
    private double capacidadActual;

    public Cafetera() {
    }

    public Cafetera(double capacidadActual){
        this.capacidadActual = capacidadActual;
    }
    
    public Cafetera(double capacidadMaxima, double capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(double capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public void llenarCafetera() {
        this.capacidadActual = this.capacidadMaxima;
    }
    
    public void vaciarCafetera() {
        this.capacidadActual = 0;
    }
}
