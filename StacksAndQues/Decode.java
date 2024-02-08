package StacksAndQues;

import java.util.Stack;

public class Decode {

    public static String decodeString(String s) {
        Stack<String> st = new Stack<>();
        Stack<Integer> it = new Stack<>();

        String currentString = "";
        int currentNum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[') {
                it.push(currentNum);
                st.push(currentString);
                currentNum = 0;
                currentString = "";
            } else if (c == ']') {
                int n1 = (it.pop());
                String prev = st.pop();
                while (n1 > 0) {
                    prev = prev + currentString;
                    n1--;
                }
                currentString = prev;
            } else if (Character.isDigit(c)) {
                currentNum = currentNum * 10 + (c - '0');
            } else {
                currentString += c;
            }
        }

        // System.out.println(currentString);
        return currentString;
    }

    public static void main(String[] args) {
        String s = "3[a2[ce]fgh]";
        String s1 = "3[a]2[bc]";
        System.out.println("ans -> " + decodeString(s));
        System.out.println("ans -> " + decodeString(s1));
    }
}
