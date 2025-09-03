package okta.saml.configuration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OrdersList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
list.add("santoor");list.add("santoor");list.add("soap");list.add("santoor");list.add("paper");list.add("paper");
    list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().forEach(System.out::println);

    }
}
