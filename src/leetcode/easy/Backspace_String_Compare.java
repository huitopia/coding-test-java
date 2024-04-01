package leetcode.easy;

import java.util.Stack;

public class Backspace_String_Compare {
    public static void main(String[] args) {
        String s = "y#fo##f";
        String t = "y#f#o##f";

        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        // pop 빼기 push 넣기
        for(int i = 0; i < s.length() ; i++) {
            System.out.println("s.charAt(i) = " + s.charAt(i));
            System.out.println("stack1.size() = " + stack1.size());
            if(s.charAt(i) == '#' && stack1.size() != 0) {
                stack1.pop();
            } else if(s.charAt(i) != '#'){
                stack1.push(s.charAt(i));
            }
        }
        for(int i = 0; i < t.length() ; i++) {
            System.out.println("t.charAt(i) = " + t.charAt(i));
            if(t.charAt(i) == '#'&& stack2.size() != 0) {
                stack2.pop();
            } else if(t.charAt(i) != '#'){
                stack2.push(t.charAt(i));
            }

        }

        System.out.println("stack1 = " + stack1);
        System.out.println("stack2 = " + stack2);
        boolean result = stack1.equals(stack2);
        System.out.println("result = " + result);
    }
}
