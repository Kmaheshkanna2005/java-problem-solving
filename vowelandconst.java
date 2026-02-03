public class vowelandconst
{
    public static void main(String[] args) {
        String s = "madam";
        String b = s.toLowerCase();
        char i=0;
        char[] arr = b.toCharArray();
        int countv=0;
        int countc=0;
        while(i<arr.length)
        {
            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' ||arr[i]=='u')
            {
                countv++;
            }
            else
            {
                countc++;
            }
            i++;
        }
        System.out.println(countv);
        System.out.println(countc);
    }
}