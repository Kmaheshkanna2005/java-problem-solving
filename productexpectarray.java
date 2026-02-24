public class productexpectarray {
    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4};
        int pro = 1;
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            pro*=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            int sum  = pro/nums[i];
            arr[i]=sum;
        }
        for(int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j]+" ");   
        }
    }
}
