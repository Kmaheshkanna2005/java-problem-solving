

public class palindrome {
    public static void main(String[] args) {
        String m="maam";
        char[] arr = m.toCharArray();
        int left=0;
        int right=m.length()-1;
        boolean ispal = true;
        while(left<right)
        {
            if(arr[left]!=arr[right])
            {
                ispal = false;
                break;
            }
            left++;
            right--;
        }
        if(!ispal)
        {
            System.out.println("the given element is not a palindrome");
        }
        else{
            System.out.println("the given element is a palindrome");
        }
    }
}
