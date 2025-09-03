package okta.saml.configuration;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main(String[] args){
        int[] test = new int[]{1,2,3};

        List<List<Integer>> listOfList = new ArrayList<>();

        for(int i=0;i<test.length;i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = i; j <test.length; j++) {
                temp.add(test[j]);
                listOfList.add(new ArrayList<>(temp));

            }
        }
        System.out.println(listOfList);
    }
}
