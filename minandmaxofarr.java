
import java.util.*;

public class minandmaxofarr {
    public static void main(String[] args) {
        int[] arr1 = {1,2,8,4,6,3};
        System.out.println("type 1");
        int min = arr1[0];
        int max = arr1[arr1.length-1];
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]<min)
            {
                min = arr1[i];
            }
            if(arr1[i]>max)
            {
                max = arr1[i];
            }
        }
        System.out.println(min+" "+max);
        System.out.println("type 2");

        Arrays.sort(arr1);
        int mins = arr1[0];
        int maxs = arr1[arr1.length-1];
        System.out.println(mins+" "+maxs);
    }
}
