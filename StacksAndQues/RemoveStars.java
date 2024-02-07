package StacksAndQues;

import java.util.*;

public class RemoveStars {

    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '*') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    continue;
                } else {
                    stack.pop();
                }
            }
        }

        if (stack.isEmpty())
            return "";
        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}
