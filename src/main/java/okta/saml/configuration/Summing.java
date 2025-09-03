package okta.saml.configuration;

import java.util.Arrays;

public class Summing {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};

        System.out.println(Arrays.toString(addUp(nums)));
    }
    public static int[] addUp(int[] nums){
         int sum=0;

         for(int i =0;i<nums.length;i++){
             sum += nums[i];
             nums[i]=sum;

         }
         return nums;
    }
}
