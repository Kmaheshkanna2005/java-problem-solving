
import java.util.*;

public class addsumofchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        List<Integer> list = new ArrayList<>();
        int num = 0;
        boolean build = false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>='0' && arr[i]<='9')
            {   
                num = num*10+(arr[i]-'0');
                build=true;
            }
            else
            {
                if(build)
                {
                    list.add(num);
                    num=0;
                    build=false;
                }
            }
        }
         if(build)
            {
                list.add(num);
            }
        int sum=0;

        for(int a : list)
        {
            sum+=a;
        }
        System.out.println(sum);
    }
}
