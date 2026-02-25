import java.util.*;
public class largest_con_num {
    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        Set<Integer> s = new TreeSet<>();
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int j=0;
        int tar=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(tar==nums[i])
            {
                list.add(nums[i]);
            }
            tar+=1;
        }
        System.out.println(list);
        System.out.println(list.size());

    }
}
