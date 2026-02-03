import java.util.*;

public class removeduplicateDS {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,8,6,4,8};
        Set<Integer> hs = new LinkedHashSet<>(); 
        for(int i : arr) {
            hs.add(i); 
        }
        System.out.println("Unique elements in order:");
        for(int j : hs) {
            System.out.print(j+" ");
        }
    }
}
