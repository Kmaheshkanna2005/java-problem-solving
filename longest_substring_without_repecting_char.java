import java.util.*;

public class longest_substring_without_repecting_char {
    public static void main(String[] args) {
        String s  = "abcabcbb";
        int left =0;
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        for(int right=0;right<s.length();right++)
        {
            while(set.contains(s.charAt(right)))
            {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            max=Math.max(max,right-left+1);
        }
        System.out.println(max);
    }
}
