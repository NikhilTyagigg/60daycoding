package sixtydayofcoding;

import java.util.Scanner;
import java.util.Stack;

public class Day2 {
    public static void main(String[] args) {
        //Valid Paranthesis == {()}
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(validparanthesis(s));
    }
    public static boolean validparanthesis(String s)
    {
        Stack<Character>stack=new Stack<>();
        for (char c:s.toCharArray()) {
            if(c=='('||c=='{'||c=='{')
            {
                stack.push(c);
            }
            else
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                if (c==')'&&stack.peek()!='(') {
                    return  false;
                }
                if (c=='}'&&stack.peek()!='{') {
                    return  false;
                }
                if (c==']'&&stack.peek()!='[') {
                    return  false;
                }
                stack.pop();
            }

        }
        return stack.isEmpty();
    }
}
