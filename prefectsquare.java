import java.util.*;

public class prefectsquare
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        long left = 0;
        long right = num;
        boolean is = false;
        while(left<=right)
        {
            long mid = left+(right-left)/2;
            long sqr = mid*mid;

            if(num==sqr)
            {
                is  = true;
                break;
            }
            else if(sqr>num)
            {
                right = mid-1;
            }
            else
            {
                left = mid+1;
            }
        }
        if(is)
        {
            System.out.println("is Valid");
        }
        else
        {
            System.out.println("not Valid");
        }
    }
}