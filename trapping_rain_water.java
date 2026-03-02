public class trapping_rain_water {
    public static void main(String[] args) {
        int[] arr = {4,2,0,3,2,5};
        int left=0;
        int right = arr.length-1;
        int water = 0;
        int leftmax = 0;
        int rightmax = 0;

        while(left<right)
        {
            if(arr[left]<arr[right])
            {
                if(arr[left]>leftmax)
                {
                    leftmax = arr[left];
                }
                else{
                    water+=leftmax-arr[left];
                }
                left++;
            }
            else
            {
                if(arr[right]>rightmax)
                {
                    rightmax = arr[right];
                }
                else
                {
                    water+=rightmax-arr[right];
                }
                right--;
            }
        }
        System.out.println(water);
    }
}
