import java.util.*;

public class groupofanagram {
    public static void main(String[] args) {
        String[] arr = {"eat","ate","book","ookb","kobo","sleep"};
        Map<String,List<String>> map  = new LinkedHashMap<>();
        for(String a : arr)
        {
            char[] arr1 = a.toCharArray();
            Arrays.sort(arr1);
            String key = new String(arr1);
            if(!map.containsKey(key))
            {
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(a);
        }

        for(Map.Entry<String,List<String>> list :map.entrySet())
        {
            System.out.println(list.getValue());
        }
    }
}
