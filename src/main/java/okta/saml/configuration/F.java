package okta.saml.configuration;

import java.util.*;

public class F {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba","dog dog dog dog")); // false
        System.out.println(wordPattern("abba","dog cat cat dog")); // true
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] pat = pattern.split("");
        String[] sPat = s.split(" ");

        if (pat.length != sPat.length) return false;

        Map<String, String> map = new HashMap<>();
        Set<String> usedWords = new HashSet<>(); // track already-mapped words

        for (int i = 0; i < pat.length; i++) {
            String ch = pat[i];
            String word = sPat[i];

            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(word)) {
                    return false; // mismatch mapping
                }
            } else {
                if (usedWords.contains(word)) {
                    return false; // word already mapped to another char
                }
                map.put(ch, word);
                usedWords.add(word);
            }
        }
        return true;
    }
}
