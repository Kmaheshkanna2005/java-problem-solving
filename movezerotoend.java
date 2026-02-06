public class movezerotoend
{
    public static void main(String[] args) {
        int [] arr = {1,2,0,3,0,4};
        int last=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                int temp = arr[i];
                arr[i] = arr[last];
                arr[last] = temp;
                last++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}