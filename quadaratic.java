
import java.util.Scanner;

public class quadaratic {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int r = (int) Math.pow(b,2);
        int result = r-4*(a*c);
        System.out.print(result);
    }
}
