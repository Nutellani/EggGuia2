/*
10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo 
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El 
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por 
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos 
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 
elementos y el combinado de 20. 
 */
package ej10;

public class Ej10 {

    public static void main(String[] args) {

        double[] arrayA = new double[50];
        double[] arrayB = new double[20];

        fillArray(arrayA);
        sortArray(arrayA);
        fillArrayB(arrayB, arrayA);
        showArray(arrayA);
        showArray(arrayB);
    }

    private static void fillArray(double[] Array) {

        for (int i = 0; i < Array.length; i++) {
            Array[i] = Math.floor(Math.random() * 100);
        }
    }

    private static void fillArrayB(double[] arrayB, double[] arrayA) {
        int halfLength = arrayB.length / 2;

        for (int i = 0; i < halfLength; i++) {
            arrayB[i] = arrayA[i];
        }

        for (int i = halfLength; i < arrayB.length; i++) {
            arrayB[i] = 0.5;
        }
    }

    private static void sortArray(double[] array) {

        double aux;

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    aux = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = aux;
                }
            }
        }
    }

    private static void showArray(double[] array) {

        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
