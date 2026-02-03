
import java.util.ArrayList;
import java.util.List;

public class twosum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int tar = 9;
        List <Integer> ls = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==tar)
                {
                    ls.add(i);
                    ls.add(j);
                }
            }
        }
        System.out.println(ls);
    }
}
