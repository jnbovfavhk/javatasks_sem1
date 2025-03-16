package org.knit.jnbovfavhk.sem1.lab4;

public class StringInfo {
    private String string;
    private int[] frequency;
    private String alphabet;


    public StringInfo(String string) {
        this.string = string;


        for (int i='а'; i <= 'я'; i++) {
            alphabet += (char)i;
        }

        frequency = new int[alphabet.length()];
        for (int i = 0; i < alphabet.length(); i++) {
            String a = String.valueOf(alphabet.charAt(i));
            frequency[i] = string.split(a).length - 1;
        }


    }
}
