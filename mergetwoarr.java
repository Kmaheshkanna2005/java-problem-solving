
import java.util.Scanner;

public class mergetwoarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n = ");
        int n = sc.nextInt();
        System.out.print("Enter the m = ");
        int m = sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[m];
        System.out.println("Enter the element to arr1:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to arr2:");
        for(int i=0;i<m;i++)
        {
            arr1[i]=sc.nextInt();
        }
        int l = n+m;
        int[] arr2 = new int[l];
        int i=0;
        while(i<n)
        {
            arr2[i]=arr[i];
            i++;
        }
        int b=0;
        while(i<l)
        {
            arr2[i]=arr1[b];
            i++;
            b++;
        }
        System.out.println("the element in merge arr:");
        for(int g=0;g<arr2.length;g++)
        {
            System.out.print(arr2[g]+" ");
        }
    }
}
