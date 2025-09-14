package com.dsa.practice;

class Solution2 {
    static {
        for (int i = 0; i < 100; i++) {
            System.out.println( singleNumber(new int[]{4,1,2,1,2}));
        }
    }
    public static int singleNumber(int[] nums) {
        int x =0;
        for (int num : nums) {
            x = x ^ num;
        }
        return x;
    }

    public static void main(String[] args) {

    }
}
