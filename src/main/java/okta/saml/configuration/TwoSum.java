package okta.saml.configuration;

import java.util.HashMap;

class TwoSum {
    public static void main(String[] args) {
        twoSum(new int[]{3, 2, 4},6);
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] twoSum = new int[2];

        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    twoSum[0]=i;
                    twoSum[1]=j;
                    return twoSum;
                }
            }
        }
        return twoSum;
    }

    public static int[] hashMap(int[] arrays,int target){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arrays.length;i++){
            int sub = target - arrays[i];
            if(map.containsKey(sub)){
                return new int[]{map.get(sub),i};
            }
            map.put(arrays[i],i);
        }
        return null;
    }
}