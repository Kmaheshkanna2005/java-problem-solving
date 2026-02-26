import java.util.*;
public class duplicateingivenwin {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2};
        int k=2;
        HashSet<Integer> set = new HashSet<>();
        int right = 0;
        int left = 0;
        boolean is = false;
        for(int i=0;i<k;i++)
        {
            if(set.contains(arr[right]))
            {
                is = true;
                break;
            }
            set.add(arr[right]);
            right++;
        }
       
        while(is==false && right<arr.length)
        {
            if(set.contains(arr[right]))
            {
                is = true;
                break;
            }
            set.remove(arr[left]);
            left++;
            set.add(arr[right]);
            right++;
        }
        if(is)
        {
            System.out.println("the duplicate element is present");
        }
        else
        {
            System.out.println("the duplicate is not present in array");
        }
    }
}
