import java.util.*;

public class sortthestring {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        // String b ="";
        // for(int i=0;i<arr.length;i++)
        // {
        //     b=b+arr[i];
        // }
        // System.out.println(b);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            sb.append(arr[i]);
        }
        System.out.println(sb.toString());
    }
}
