public class findlarandsmall {
    public static void main(String[] args) {
        String words = "A word is hidden";
        String[] arr = words.split(" ");
        String small=arr[0];
        String large = arr[0];
        for(String i : arr)
        {
            if(i.length()<small.length())
            {
                small = i;
            }
            if(i.length()>large.length())
            {
                large = i;
            }
        }
        System.out.println(small);
        System.out.println(large);
    }
}
