
import java.util.*;

public class vaildpar
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s  = sc.nextLine();

        char[] arr = s.toCharArray();

        Stack<Character> st = new Stack<>();

        boolean is = true;
        for(int i=0;i<arr.length;i++)
        {
        if(arr[i]=='(' || arr[i]== '[' || arr[i]=='{')
        {
            st.push(arr[i]);
        }
        else
        {
        if(st.isEmpty())
            {
                is = false;
                break;
            }
            char top = st.pop();
            if(arr[i]==']' && top!='[' || arr[i]=='}' && top!='{' || arr[i]==')' && top!='(')
            {
                is = false;
                break;
            }
        }
    }
        if(is)
        {
            System.out.println("the string is vaild");
        }
        else
        {
            System.out.println("the string is in valid");
        }
    }
}