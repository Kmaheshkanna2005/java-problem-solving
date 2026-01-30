import java.util.*;

public class twosum
{
    public static void main(String[] args)
    {
        int[] arr = {2,7,11,15};
        int target = 9;
        List<Integer> ls = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    ls.add(i);
                    ls.add(j);
                }
            }
        }
        System.out.print(ls);
        // for(int i=1;i<ls.size()-1;i++)
        // {
        //     System.out.println(ls.get(i)+" ");
        // }
    }
}