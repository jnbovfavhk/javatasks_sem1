package org.knit.jnbovfavhk.lab4;

public class Check2string {
    public static boolean check(String word, String userword) {
        if (word.length() > userword.length()) {
            return false;
        }
        char[] word1 = word.toCharArray();
        char[] userword1 = userword.toCharArray();
        int k = 0;
        for (int i = 0; i < word1.length; i++) {
            for (int j = 0; j < userword1.length; j++) {
                if (k == word1.length) {
                    return true;
                }
                if (word1[i] == userword1[j]) {
                    userword1[j] = 0;
                    k++;
                }
            }
        }
        return false;
    }}

