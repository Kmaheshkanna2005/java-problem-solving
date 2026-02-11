
import java.util.*;

public class findduplicate {
    public static void main(String[] args) {
        String s = "madam";
        char[] arr = s.toCharArray();
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);
        for(Map.Entry<Character,Integer> entry:map.entrySet())
        {
            if(entry.getValue()>1)
            {
                System.out.println(entry.getKey());
            }
        }
    }
}
