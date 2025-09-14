package com.dsa.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Median {
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 6}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        List<int[]> list = new ArrayList<>();

        list.add(Arrays.stream(nums1).toArray());
        list.add(Arrays.stream(nums2).toArray());
        List<Integer> flatNums = list.stream().flatMap(ll -> Arrays.stream(ll).boxed()).sorted().collect(Collectors.toList());

        int index = flatNums.size() / 2;
        if (flatNums.size() % 2 == 0) {
            return (double) (flatNums.get(index - 1) + flatNums.get(index)) / 2;
        } else {
            return flatNums.get(index);
        }

    }
}
