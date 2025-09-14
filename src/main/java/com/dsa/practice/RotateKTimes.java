package com.dsa.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RotateKTimes {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6};   //6,5,4,3,2,1

        int k =3;

       rotateKTimes(array,0,array.length-1);
       rotateKTimes(array,0,array.length-k-1);
        rotateKTimes(array,array.length-k,array.length-1);


        System.out.println(Arrays.toString(array));

    }
    public static void rotateKTimes(int[] array, int start,int end) {

        while(start<end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;

        }
    }
}

