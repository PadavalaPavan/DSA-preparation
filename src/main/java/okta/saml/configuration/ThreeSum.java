package okta.saml.configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeSum {
    public static void main(String[] args) {
        System.out.println( threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        nums = Arrays.stream(nums).distinct().toArray();
        List<List<Integer>> threeSum = new ArrayList<>();
        for(int i =0; i<nums.length;i++){
            int x = nums[i];
            int y=i+1;
            while(y<nums.length){
                int z=y+1;
                while(z<nums.length){
                    if(x+nums[y]+nums[z]==0){
                        List<Integer> sum = new ArrayList<>();
                        sum.add(nums[i]);
                        sum.add(nums[y]);
                        sum.add(nums[z]);
                        threeSum.add(sum);
                    }
                    z++;
                }
                y++;
            }
        }
        return threeSum;
    }
}
