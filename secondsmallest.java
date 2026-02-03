
import java.util.*;;

public class secondsmallest {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,2,3,4};
        Arrays.sort(arr);
        int k=2;
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
        int result = arr[k];
        System.out.println(" ");
        System.out.print(result);
    }
}
