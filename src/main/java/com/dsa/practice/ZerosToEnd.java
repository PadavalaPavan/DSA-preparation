package com.dsa.practice;

import java.util.Arrays;

public class ZerosToEnd {
    public static void main(String[] args) {
        int[] list = new int[]{1, 0, 9, 0, 4, 5};

       int[] l= usingPlaceShift(list);
        System.out.println(Arrays.toString(l));

    }
    public static void simple(int[] list){
        int[] list1 = new int[list.length];
        int lastIndex = list.length-1,currentIndex=0;
        for (int j : list) {
            if (j == 0) {
                list1[lastIndex] = 0;
                lastIndex--;
            } else {
                list1[currentIndex] = j;
                currentIndex++;
            }
        }
        for(int i : list1) {
            System.out.println(i);
        }

    }
    public static int[] usingPlaceShift(int[] nums){
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index++]=nums[i];

            }
        }
        while(index<nums.length){
            nums[index++]=0;
        }
        return nums;
    }
}
