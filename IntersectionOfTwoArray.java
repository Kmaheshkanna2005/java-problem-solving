
import java.util.*;


public class IntersectionOfTwoArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = {4, 5, 6, 7, 8};

        // List<Integer> list = new LinkedList<>();

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr1.length; j++) {

        //         if (arr[i] == arr1[j]) {
        //             list.add(arr[i]);
        //         }
        //     }
        // }

        // System.out.println(list);
        Set<Integer> set = new HashSet<>();
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        for(int j=0;j<arr1.length;j++)
        {
            if(set.contains(arr1[j]))
            {
                list.add(arr1[j]);
            }
        }
        System.out.println(list);
    }
}
