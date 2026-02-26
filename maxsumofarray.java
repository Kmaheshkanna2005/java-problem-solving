public class maxsumofarray
{
    public static void main(String[]args)
    {
        int[] arr = {2,1,5,1,3,2};
        int k = 3;

        int currentsum=0;
        int maxsum=0;

        for(int i=0;i<k;i++)
        {
            currentsum+=arr[i];
        }
        maxsum = currentsum;
        for(int i=k;i<arr.length;i++)
        {
            currentsum+=arr[i];
            currentsum-=arr[i-k];
            maxsum = Math.max(currentsum, maxsum);
        }
        System.out.println(maxsum);
    }
}