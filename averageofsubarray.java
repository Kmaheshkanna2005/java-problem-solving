public class averageofsubarray {
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int k=3;
        double maxavg = 0;
        double currectavg = 0;
        for(int i=0;i<k;i++)
        {
            currectavg+=arr[i];
        }
        maxavg=currectavg/k;
        double sumavg=0;
        for(int i=k;i<arr.length;i++)
        {
            currectavg+=arr[i];
            currectavg-=arr[i-k];
            sumavg=currectavg/k;
            maxavg=Math.max(sumavg,maxavg);
        }
        System.out.println(maxavg);
    }
}
