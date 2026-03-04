public class searchrotatedarray
{
    public static void main(String[] args)
    {
        int[] arr = {4,5,6,7,0,1,2};
        int tar = 0;

        int left=0;
        int right = arr.length-1;

        while(left<=right)
        {
            int mid = left+(right-left)/2;

            if (arr[mid] == tar) {
                System.out.println(mid);
                break;
            }

            if(arr[left]<=arr[mid])
            {
                if(arr[left]<=tar && arr[mid]>tar)
                {
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
            else
            {
                if(arr[mid]<tar && arr[right]>=tar)
                {
                    left = mid+1;
                }
                else
                {
                    right = mid-1;
                }
            }
        }
    }
}