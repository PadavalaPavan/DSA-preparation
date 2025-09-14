package com.dsa.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {
    public static void main(String[] args) {
        System.out.println(letterCombinations(""));
    }


    public static List<String> letterCombinations(String digits) {

        Map<String, String> map = new HashMap<>();
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");

        List<String> list = new ArrayList<>();
        String[] digit;
        if (digits.isEmpty()) {
            return list;
        } else if (digits.length() == 1) {
            digit = digits.split("");
            String map1 = map.get(digit[0]);
            for (int i = 0; i < map1.length(); i++) {
                list.add("" + map1.charAt(i));
            }
            return list;
        } else {
            digit = digits.split("");
            String map1 = map.get(digit[0]);
            String map2 = map.get(digit[1]);
            System.out.println(map1.charAt(0) + map2);
            for (int i = 0; i < map1.length(); i++) {
                for (int j = 0; j < map2.length(); j++) {
                    list.add("" + map1.charAt(i) + map2.charAt(j));
                }
            }

            return list;
        }
    }
}
