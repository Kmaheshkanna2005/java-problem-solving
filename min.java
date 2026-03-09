public class min
{
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        int min = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        int left = 0;
        int right = 0;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]==min)
            {
                right = j;
            }
        }
        int length = (right-left)+1;
        System.out.println(length);
    }
}