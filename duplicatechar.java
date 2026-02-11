
import java.util.*;

public class duplicatechar {
    public static void main(String[] args)
    {
        String s  = "mom";
        char[] ch = s.toCharArray();
        Set<Character> sb = new LinkedHashSet<>();
        for(int i=0;i<ch.length;i++)
        {
            sb.add(ch[i]);
        }
        System.out.println(sb);
        for(char arr:sb)
        {
            System.out.print(arr+" ");
        }
    }
}
