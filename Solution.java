import java.util.*;

class Solution
{
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,2,3};
        int k=1;
        LinkedHashMap<Integer,Integer> list = new LinkedHashMap<>(); 
        for(int i=0;i<nums.length;i++)
        {
            list.put(nums[i],list.getOrDefault(nums[i],0)+1);
        }
        System.out.println(list);
        int[] arr = new int[k];
        for(int i=0;i<k;i++)
        {
            int maxkey=-1;
            int maxvalue=0;
            for(Map.Entry<Integer,Integer> entry : list.entrySet())
            {
            if(entry.getValue()>maxvalue)
            {
                maxkey=entry.getKey();
                maxvalue=entry.getValue();
            }
            }
            arr[i]=maxkey;
            list.remove(maxkey);
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}