package com.dsa.practice;

public class ValidPalindrome {
    public static void main(String[] args){
       String s = "race a car";
       s = regexConversion(s);
        System.out.println( isPalindrome(s));


    }

    public static String regexConversion(String s){
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        return s;
    }
    public static boolean isPalindrome(String s){
         int left=0,right=s.length()-1;
         while(left<right){
             if(s.charAt(left)!=s.charAt(right)){
                 return false;
             }
             left++;right--;
         }
         return true;
    }
}
