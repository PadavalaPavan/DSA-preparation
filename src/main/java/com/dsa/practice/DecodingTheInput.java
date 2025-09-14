package com.dsa.practice;

public class DecodingTheInput {
    public static void main(String[] args) {
        String input = "a3b4c5";

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length() - 1; i++) {
            char c = input.charAt(i);
            if (Character.isDigit(input.charAt(i + 1))) {
                int count = Character.getNumericValue(input.charAt(i + 1));
                for (int j = 0; j < count; j++) {
                    output.append(c);
                }
            }
        }
        System.out.println(output);

    }
}
