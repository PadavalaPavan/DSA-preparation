package okta.saml.configuration;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;

public class FirstUniqueChar {
    public static void main(String[] args){
        String name = "padavala";

        Arrays.stream(name.split("")).collect(Collectors.toMap(n -> n, m -> 1,Integer::sum,LinkedHashMap::new))
                .entrySet().stream().filter(n -> n.getValue()==1).limit(1).forEach(System.out::println);

    }
}
