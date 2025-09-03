package okta.saml.configuration;
import java.util.*;
import java.util.stream.Collectors;

public class test1 {
     public static void main(String[] args){

         List<Integer> list = Arrays.asList(3,1,4,5,10,14,12,27,6,8,7,9,1,11);

         Set<Integer> set1 = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toSet());

      Map<String,String> map = new HashMap<>();
      map.put("name","pavan");
      map.values();
         System.out.println( map.keySet());
         Set<Integer> set = new HashSet<>(list);
         List<Integer> longSeq = new ArrayList<>();
         for(int input: set){
             List<Integer> currSeq = new ArrayList<>();
            while(set.contains(input)){
                currSeq.add(input);
                input++;
            }
            if(currSeq.size()>longSeq.size()){
                longSeq = currSeq;
            }
         }

         System.out.println(longSeq);
     }
  }
