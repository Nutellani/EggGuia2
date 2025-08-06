
package ej2;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circunferencia {
    
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRatio() {
        return radio;
    }

    public void setRatio(double radio) {
        this.radio = radio;
    }
    
    public double calculateArea(){
        return pow(radio, 2) * PI;
    }
    
    public double calculatePerimeter(){
        return 2*PI*radio;
    }
    
}
