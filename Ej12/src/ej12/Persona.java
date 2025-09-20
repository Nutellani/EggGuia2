package ej12;

import java.util.Date;

public class Persona {

    private String nombre;
    private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    ////////////     GETTERS & SETTERS     ////////////
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean youngerThan(int age) {
        return getYearsOld() < age;
    }

    private int getYearsOld() {
        Date today = new Date();
        return today.getYear() - fechaNacimiento.getYear();
    }

    public void tellAge() {
        System.out.println("Usted tiene " + getYearsOld() + " años, ja viejo chot..");
    }
}
