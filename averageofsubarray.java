public class averageofsubarray {
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int k=2;
        int start=0;
        int end = 0;
        int sum=0;
        int avg = 0;
        int maxavg= 0;
        while(end<arr.length)
        {
            end=start+k;
            for(int i=start;i<=end;i++)
            {
                sum+=arr[i];
            }
            avg=sum/k;
            maxavg = Math.max(avg, maxavg);
        }
        System.out.println(maxavg);
    }
}
