package okta.saml.configuration;

import java.util.Optional;
import java.util.Stack;

public class Test3 {
    public static void main(String[] args) {
        System.out.println( isValid("()[]{}"));
    }

    public static boolean isValid(String input) {

        Stack<Character> s = new Stack<>();
        for (char c : input.toCharArray()) {
            if (c == '[' || c == '{' || c == '(') {
                s.push(c);
            } else {
                if (s.isEmpty())
                    return false;

                char top = s.pop();

                if ((top != '[' && c == ']') || (top != '{' && c == '}') || (top != '(' && c == ')'))
                    return false;
            }

        }
        return s.isEmpty();
    }
}

class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int i = 0;
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack[i++] = ')';
            else
                if (c == '{')
                stack[i++] = '}';
            else
                if (c == '[')
                    stack[i++] = ']';
            else
                if (i == 0 || stack[--i] != c)
                    return false;
        }
        return i == 0;
    }
}
























