public class reversethewordinsen {
    public static void main(String[] args) {
        String s = "the word is hidden";
        String[] arr=s.split(" ");
        String s1 = "word";
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].equals(s1))
            {
                arr[i] = new StringBuilder(arr[i]).reverse().toString();
            }
        }
        System.out.println(String.join(" ",arr));
    }
}
