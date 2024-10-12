package org.knit.jnbovfavhk.lab4;

public class Check2string {
    public static boolean check(String word, String userword) {
        if (word.length() > userword.length()) {
            return false;
        }
        char[] s1 = word.toCharArray();
        char[] us2 = userword.toCharArray();
        int k = 0;
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < us2.length; j++) {
                if (k == s1.length) {
                    return true;
                }
                if (s1[i] == us2[j]) {
                    s1[i] = 0;
                    us2[j] =0;
                    k++;
                }
            }
        }
        return false;
    }}

