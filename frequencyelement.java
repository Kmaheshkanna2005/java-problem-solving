
import java.util.*;

public class frequencyelement {
    public static void main(String[] args)
    {
        int[] arr = {1,2,2,3,4,5};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        //System.out.println(map);
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue()==1)
            {
                System.out.println(entry.getKey());
            }
        }
    }
}
