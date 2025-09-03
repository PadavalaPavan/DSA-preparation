package okta.saml.configuration;

import java.util.Hashtable;

class C {
    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1,0,1,1},1));
        int num =3;
        System.out.println(num/10);
        System.out.println(num%10);
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Hashtable<Integer,Integer> table = new Hashtable<>();

        for(int i=0;i<nums.length;i++){
            if(table.containsKey(nums[i])){
                if(Math.abs(table.get(nums[i])-i) <= k){
                    return true;
                }
                table.put(nums[i],i);
            }
            table.put(nums[i],i);
        }
        return false;
    }
}
