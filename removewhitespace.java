import java.util.Scanner;

public class removewhitespace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String out = s.replaceAll("\\s+","");
        System.out.println(out);
    }
}
