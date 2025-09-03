package okta.saml.configuration;

import java.util.*;
import java.util.stream.Collectors;

public class SortMapByKey {
    public static void main(String[] args) {
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("z", 10);
        unsortedMap.put("b", 5);
        unsortedMap.put("a", 6);

        Map<String,Integer> sorted = unsortedMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
                 .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(a,b)->b, LinkedHashMap::new));
        System.out.println(sorted);

    }
}