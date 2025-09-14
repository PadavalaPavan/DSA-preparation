package com.dsa.practice;

import java.util.Arrays;

public class a {

    public static void main(String[] args) {
        merge(new int[] {1,2,3,0,0,0},3,new int[] {2,4,5},3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] newArray = new int[m+n];
        addElems(newArray, nums1, 0, m);
        addElems(newArray, nums2, m,  n);
        sorting(newArray);
        System.out.println(Arrays.toString(newArray));
    }

    public static int[] addElems(int[] newArray,int[] nums1, int start,int end){
        for(int i=0;i<end;i++){
            newArray[start] = nums1[i];
            start++;
        }
        return newArray;
    }
    public static int[] sorting(int[] newArray){
        for(int i=0;i<newArray.length-1;i++){ // 5,10,9,8,3,1
            for(int j=i+1;j<newArray.length;j++){
                if(newArray[i]>newArray[j]){
                  int  temp =  newArray[i];
                  newArray[i] = newArray[j];
                  newArray[j]=temp;
                }
            }
        }
        return newArray;
    }
}
