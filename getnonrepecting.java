import java.util.*;

public class getnonrepecting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character,Integer> list = new LinkedHashMap<>();
        char[] arr  = s.toCharArray();

        for(int i=0;i<arr.length;i++)
        {
            list.put(arr[i],list.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Character,Integer> entry: list.entrySet())
        {
            if(entry.getValue()==1)
            {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
