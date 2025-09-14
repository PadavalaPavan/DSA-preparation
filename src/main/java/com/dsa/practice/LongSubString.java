package com.dsa.practice;

public class LongSubString {

public static void main(String[] args){
    System.out.println( lengthOfLongestSubstring("pwweke"));
}

    public static int lengthOfLongestSubstring(String s) {
        StringBuilder current = new StringBuilder();
        int maxLength = 0;
        for (char c : s.toCharArray()) {
            String str = String.valueOf(c);
            if (current.toString().contains(str)) {
                current = new StringBuilder(current.substring(current.indexOf(str) + 1));
            }
            current.append(str);
            maxLength = Math.max(maxLength, current.length());
        }

        return maxLength;
    }
}

