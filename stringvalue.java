
import java.util.*;
public class stringvalue
{
    public static void main(String[] args)
    {
        String s = "1abc23e4";

        char[] arr = s.toCharArray();

        List<Integer> list = new LinkedList<>();
        int num = 0;
        for(int i=0;i<arr.length;i++)
        {
            int digit = arr[i]-'0';
            
            if(digit<48)
            {
                num = num*10+digit;
            }
            else{
                list.add(num);
                num=0;
            }
        }
        if(num>0)
        {
            list.add(num);
        }
        System.out.print(list);
        int sum = 0;
        for(int n : list)
        {
            sum+=n;
        }
        System.out.println(sum);
    }
}