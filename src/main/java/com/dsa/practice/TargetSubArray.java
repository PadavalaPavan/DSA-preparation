package com.dsa.practice;

public class TargetSubArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 9};
        int target = 9;
        int min = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            int sum = 0;

            for (int j = i; j < array.length; j++) {
                sum += array[j];
                if(sum>target){
                    break;
                } else
                if (sum == target) {
                    min = Math.min(min, j - i + 1);
                    break;

                }
            }

        }
        System.out.println(min);
    }
}
