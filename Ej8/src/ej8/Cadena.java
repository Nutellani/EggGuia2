package ej8;

public class Cadena {

    private String phrase;
    private int phraseLength;

    public Cadena() {
    }

    public Cadena(String phrase, int phraseLength) {
        this.phrase = phrase;
        this.phraseLength = phraseLength;
    }

    /// GETTERS N' SETERS
    
    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public int getPhraseLength() {
        return phraseLength;
    }

    public void setPhraseLength(int phraseLength) {
        this.phraseLength = phraseLength;
    }
    
}
