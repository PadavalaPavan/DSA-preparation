package com.streams.practice;

public class Reversed {
    public static void main(String[] args) {
        System.out.println( reversed("My name is Pavan !"));
    }

    public static String reversed(String name){

        // My name is Pavan !
        // Ym eman si Navap !

        String[] s = name.split(" ");

        StringBuilder sb = new StringBuilder();

        for(String ss: s) {

            if (!Character.isLetter(ss.charAt(0))) {
                sb.append(ss).append(" ");
            } else {

                StringBuilder rev = new StringBuilder(ss).reverse();

                boolean wasCap = Character.isUpperCase(ss.charAt(0));

                if (wasCap) {
                    sb.append(rev.substring(0, 1).toUpperCase()).append(rev.substring(1).toLowerCase()).append(" ");
                }else {
                    sb.append(rev).append(" ");
                }
            }
        }

        return sb.toString();
    }
}
