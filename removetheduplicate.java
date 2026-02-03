

public class removetheduplicate{
    public static void main(String[] args)
    {
        System.out.println("using arr");
        int[] arr = {1,2,2,3,3,4,8,6,4,8};
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        int count=0;
        int last = arr[arr.length-1];
        System.out.println(" ");
        System.out.println("the last element:");
        System.out.println(last);
       for(int i=0;i<arr.length-count;i++)
       {
            for(int j=i+1;j<arr.length-count;j++)
            {
                // if(i==j)
                // {
                //     continue;
                // }
                if(arr[i]==arr[j])
                {
                    // int temp = arr[j];
                    // arr[j] = last;
                    // last = arr[j];
                    // count++;
                    // last = arr[arr.length-count-1];
                    for(int k=j;k<arr.length-count-1;k++)
                    {
                        arr[k]=arr[k+1];
                    }
                    count++;
                    j--;
                }
            }
       }
       System.out.println("After removing duplicate elements :");
       for(int i=0;i<arr.length-count;i++)   
       {
            System.out.print(arr[i]+" ");
       }
    }
}


