
import java.util.*;

public class firstrepectandnon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);
        int firstrepect = 0;
        int firstnon = 0;
        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            if(firstrepect==0 && entry.getValue()>1)
            {
                System.out.println(entry.getKey());
                firstrepect++;
            }
            if(firstnon==0 && entry.getValue()==1)
            {
                System.out.println(entry.getKey());
                firstnon++;
            }
        }
    }
}
