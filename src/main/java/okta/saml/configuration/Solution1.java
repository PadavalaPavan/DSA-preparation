package okta.saml.configuration;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution1 {
    public static int removeDuplicates(int[] nums) {
        Arrays.stream(nums).boxed().sorted();

        int k=1;
        for(int i=1;i<nums.length;i++){
            if(!(nums[i]==nums[k-1])){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args){
        System.out.println( removeDuplicates(new int[]{0,0,1,1,2,2,3,3,4}));
    }
}
