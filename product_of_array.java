public class product_of_array
{
    public static void main(String[] args) {
        int[] arr = {-1,1,0,-3,3};
        int pro = 1;
        int zero = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                zero++;
            }
            else
            {
                pro*=arr[i];
            }
        }
        int[] arr2 = new int[arr.length];
        for(int j=0;j<arr.length;j++)
        {
            if(zero>1)
            {
                arr2[j]=0;
            }
            else if(zero==1)
            {
                if(arr[j]==0)
                {
                    arr2[j]=pro;
                }
                else
                {
                    arr2[j]=0;
                }
            }
            else
                {
                    arr2[j]=pro/arr[j];
                }
        }
        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+" ");
        }

    }
}


