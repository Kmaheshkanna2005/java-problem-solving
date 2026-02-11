
import java.util.*;

public class simplecal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println(" ");
            System.out.println("Enter the + for the addition");
            System.out.println("Enter the - for the subration");
            System.out.println("Enter the * for the multiple");
            System.out.println("Enter the / for the division");
            System.out.println("Enter the 0 for the break");
            System.out.println(" ");
            System.out.print("Enter the choice = ");
            String choice = sc.next();
            int a = 0;
            int b = 0;
            switch(choice)
            {
                case "+":
                {
                    System.out.print("Enter the a number = ");
                    a = sc.nextInt();
                    System.out.print("Enter the b number = ");
                    b = sc.nextInt();
                    int sum = a+b;
                    System.out.println(" ");
                    System.out.println("the addition of two number = "+sum);
                    break;
                }
                case "-":
                {
                    System.out.print("Enter the a number = ");
                    a = sc.nextInt();
                    System.out.print("Enter the b number = ");
                    b = sc.nextInt();
                    int sub = a-b;
                    System.out.println(" ");
                    System.out.println("the subration of two number = "+sub);
                    break;
                }
                case "*":
                {
                    System.out.print("Enter the a number = ");
                    a = sc.nextInt();
                    System.out.print("Enter the b number = ");
                    b = sc.nextInt();
                    int mul = a*b;
                    System.out.println(" ");
                    System.out.println("the multiple of two number = "+mul);
                    break;
                }
                case "/":
                {
                    System.out.print("Enter the a number = ");
                    a = sc.nextInt();
                    System.out.print("Enter the b number = ");
                    b = sc.nextInt();
                    try
                    {
                        float div = a/b;
                        System.out.println(" ");
                        System.out.println("the divison of two number = "+div);
                    }
                    catch(ArithmeticException e)
                    {
                        System.out.println(" ");
                        System.out.println("Error: Cannot divide by zero. " + e.getMessage());
                    }
                    break;
                }
                case "0":
                {
                    System.out.print("Bye");
                    return;
                }
                default:
                {
                    System.out.println(" ");
                    System.out.println("Enter the vaild String choice");
                }
            }
        }
    }
}
