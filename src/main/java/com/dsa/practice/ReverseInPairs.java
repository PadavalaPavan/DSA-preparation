package com.dsa.practice;

public class ReverseInPairs {
    public static void main(String[] args) {
        int[] list = new int[]{1, 2, 3, 4, 5};


        for(int i=0;i<list.length-1;i=i+2){
            int temp = list[0];
            list[i]=list[i+1];
            list[i+1] = temp;

        }
for(int i :list){
    System.out.println(i);
}
    }
}
