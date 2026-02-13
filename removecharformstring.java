import java.util.Scanner;

public class removecharformstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char tar = sc.next().charAt(0);
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=tar)
            {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
