package okta.saml.configuration;

import java.util.*;

public class D {
    public static void main(String[] args) {
        System.out.println( wordPattern("abba","dog dog dog dog"));
        List<List<Integer>> sum = new ArrayList<>();
    }
    public static boolean wordPattern(String pattern, String s) {
        String[] pat = pattern.split("");
        String[] sPat = s.split(" ");

        Hashtable<String,String> map  = new Hashtable<>();
        Set<String> dups = new HashSet<>();
        if(pat.length==sPat.length){
            for(int i=0;i<pat.length;i++){
                if(map.containsKey(pat[i])){
                    if(!Objects.equals(map.get(pat[i]), sPat[i])){
                        return false;
                    }
                }else if(dups.contains(sPat[i])){
                    return false;
                }
                map.put(pat[i],sPat[i]);
                    dups.add(sPat[i]);
            }
        }else{
            return false;
        }
        return true;
    }
}
