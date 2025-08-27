package ej9;

public class Matematica {

    private Double number1;
    private Double number2;

    public Matematica() { 
    }

    public Matematica(Double number1, Double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    
    public static Matematica randomized() {
        double number1 = Math.floor(Math.random() * 10);
        double number2 = Math.floor(Math.random() * 10);
        
        return new Matematica(number1, number2);
    }
    
    ///////     GETTERS N' SETTERS     ///////

    public Double getNumber1() {
        return number1;
    }

    public void setNumber1(Double number1) {
        this.number1 = number1;
    }

    public Double getNumber2() {
        return number2;
    }

    public void setNumber2(Double number2) {
        this.number2 = number2;
    }
    
    public Double getMayor() {
        return Math.max(number1, number2);
    }
    
     public Double getMenor() {
        return Math.min(number1, number2);
    }
    
}
