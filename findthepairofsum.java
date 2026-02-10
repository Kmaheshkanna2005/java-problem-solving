public class findthepairofsum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int tar = 9;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==tar)
                {
                    System.out.println("sum of the "+arr[i]+"+"+arr[j]+"="+tar);
                    break;
                }
            }
        }
    }
}