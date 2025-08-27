/*
8. Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package ej8_1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ej8_1 {

    static Scanner sc = new Scanner(System.in).useDelimiter("\n"); // creo una variable aca fuera del main, dentro de la clase y estatico para que agarre a toda la clase, se pueda usar en toda la clase no solo en el main :)

    public static void main(String[] args) {

        Cadena phrase = new Cadena();
        iniciatePhrase(phrase);
        mostrarVocales(phrase);
        invertirPhrase(phrase);
        vecesRepetido(phrase);
        reemplazar(phrase);
        contiene(phrase);

        Cadena phrase2 = new Cadena();
        compararLongitud(phrase, phrase2);
        unirPhrases(phrase, phrase2);

    }

    private static void iniciatePhrase(Cadena phrase) {
        System.out.println("Ingrese una frase y finalice con ENTER pls :)");
        String newPhrase = sc.next();
        phrase.setPhrase(newPhrase.toUpperCase());
        phrase.setPhraseLength(newPhrase.length());
    }

    private static void mostrarVocales(Cadena phrase) {
        int counter = 0;
        for (int i = 0; i < phrase.getPhraseLength(); i++) {
            counter += switchVocals(phrase.getPhrase().charAt(i));
        }
        System.out.println("Se repitieron " + counter + " vocales :)");
    }

    private static int switchVocals(char vocal) {
        List<String> lista = Arrays.asList("A", "E", "I", "O", "U");

        return lista.contains("" + vocal) ? 1 : 0;
    }

    private static void invertirPhrase(Cadena phrase) {
        System.out.println("Se imprimiran " + phrase.getPhraseLength() + " caracteres invertidos en total je...");
        for (int i = phrase.getPhraseLength() - 1; i >= 0; i--) {
            System.out.print(phrase.getPhrase().charAt(i));
        }
        System.out.println();
    }

    private static void vecesRepetido(Cadena phrase) {
        System.out.print("Ingrese un caracter a buscar: ");
        String aux = sc.next().toUpperCase();
        char letter = aux.charAt(0);
        int counter = 0;
        for (int i = 0; i < phrase.getPhraseLength(); i++) {
            if (phrase.getPhrase().charAt(i) == letter) {
                counter += 1;
            }
        }
        System.out.println("Se ha repetido " + counter + " veces");
    }

    private static void compararLongitud(Cadena phrase, Cadena phrase2) {
        System.out.println("Ahora le vamos a pedir una nueva frase pa comparar :D");

        iniciatePhrase(phrase2);

        if (phrase.getPhraseLength() == phrase2.getPhraseLength()) {
            System.out.println("Ambas frases son igual de largas lel, incluyendo espacios obvio ;)");
            return;
        } else if (phrase.getPhraseLength() > phrase2.getPhraseLength()) {
            System.out.println("La PRIMER frase es mas larga que la nueva, incluyendo espacios obvio ;D");
            return;
        }
        System.out.println("La NUEVA frase es mas larga que la primera, incluyendo espacios obvio :)");
    }

    private static void unirPhrases(Cadena phrase, Cadena phrase2) {
        System.out.println("Frases unidas: " + phrase.getPhrase() + " " + phrase2.getPhrase());
    }

    private static void reemplazar(Cadena phrase) {

        System.out.print("De su frase, sobre qué letra quiere reemplazar/las?? ");
        String aux = sc.next().toUpperCase();
        String letterToChange = aux.substring(0, 1);
        System.out.print("Y por que letras va a remplazarla/as ");
        aux = sc.next().toUpperCase();
        String newLetter = aux.substring(0, 1);

        phrase.setPhrase(phrase.getPhrase().replaceAll(letterToChange, newLetter));

        System.out.println("Frase cambiada: " + phrase.getPhrase());
    }

    private static void contiene(Cadena phrase) {
        System.out.println("Que letra desea buscar chikitin ?? ¿)");
        String letterToSearch = sc.next().toUpperCase().substring(0, 1);
        
        boolean contieneLetra = phrase.getPhrase().contains(letterToSearch);        
        if (contieneLetra) {
            System.out.println("Su frase SIS contiene la letra " + letterToSearch);
            return;   
        }
        System.out.println("Su frase NON contiene la letra " + letterToSearch);
    }

}
