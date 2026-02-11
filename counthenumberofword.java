
import java.util.Scanner;

public class counthenumberofword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        //System.out.print(s);
        String[] arr = s.split("\\s+");
        int len = arr.length;
        System.out.println("the len of the arr = "+len);
    }
}
