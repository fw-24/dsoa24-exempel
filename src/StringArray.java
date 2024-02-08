import java.util.Arrays;

public class StringArray {

    String[] values;
    public StringArray(String[] values) {
        this.values = values;
    }

    public void add(String value) {
        // skapa ny array
        String[] newValues = new String[values.length+1];
        // kopiera över innehållet
        for (int i = 0; i < values.length; i++) {
            newValues[i] = values[i];
        }
        // lägg till värdet på slutet
        newValues[values.length] = value;
        values = newValues;
    }

    public void add(int index, String value) {
        add(null); // lägg till null på slutet av values
        // flytta varje värde ett steg framåt från slutet till index
        for (int i = values.length-1; i > index; i--) {
            values[i] = values[i-1];
        }
        // lägg till värdet på rätt plats
        values[index] = value;
    }

    // CC: The Reversal
    public void reverse() {
        String[] rev = new String[values.length];
        //int newI = values.length-1;
        for (int i = 0; i < values.length; i++) {

            rev[i] = values[values.length-i-1];
            //rev[i] = values[newI];
            //newI--;
        }
        values = rev;
    }

    public String toString() {
        return Arrays.toString(values);
    }

    public int size() {
        return values.length;
    }



}
