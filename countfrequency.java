import java.util.*;

public class countfrequency {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,3,4};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
        for(Map.Entry<Integer,Integer>entry:map.entrySet())
        {
            System.out.println("key = "+entry.getKey()+" value = "+entry.getValue());
        }
    }
    
}
