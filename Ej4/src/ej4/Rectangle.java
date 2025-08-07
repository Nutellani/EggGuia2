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

public class Rectangle {
    
    private double base;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double base, double heigh) {
        this.base = base;
        this.height = heigh;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeigh() {
        return height;
    }

    public void setHeigh(double heigh) {
        this.height = heigh;
    }
    
    
    
}
