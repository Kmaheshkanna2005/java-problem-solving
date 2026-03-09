
import java.util.*;

public class vaildpart {
    public static void main(String[] args) {
        String s = "()[]{}";

        char[] arr = s.toCharArray();
        boolean is = true;
        Stack<Character> st = new Stack<>();

       for(char c : arr)
       {
        if(c=='(' || c== '[' || c=='{')
        {
            st.push(c);
        }
        else{
            if(st.isEmpty())
            {
                is = false;
                break;
            }
            char top = st.pop();
            if ((c == ')' && top != '(') ||
                    (c == ']' && top != '[') ||
                    (c == '}' && top != '{')) {
                    is = false;
                    break;
            }
        }
       }
       if(!st.isEmpty())
       {
        is=false;
       }
       if(is)
       {
        System.out.print("this is vaild");
       }
       else
       {
        System.out.print("this is invalid");
       }
    }
}
