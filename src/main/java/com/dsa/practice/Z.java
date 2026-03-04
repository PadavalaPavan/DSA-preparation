package com.dsa.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Z {
    public static void main(String[] args) {
        //Input: nums = [3,2,4],
        int target = 6;

        int[] nums = {3, 2, 4};
        System.out.println(Arrays.toString(index(nums, target)));


    }
    public static int[] index(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i =0; i<nums.length;i++){
          int sep = target - nums[i];
            if(map.containsKey(sep)){
                return new int[]{map.get(sep),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
