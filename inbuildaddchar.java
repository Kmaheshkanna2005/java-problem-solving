public class inbuildaddchar {
    public static void main(String[] args) {
        String s  = "1abc23";

        String[] num = s.replaceAll("[^0-9]"," ").trim().split("\\s+");
        int count = 0;
        for(String a : num)
        {
            if(!a.isEmpty())
            {
                count+=Integer.parseInt(a);
            }
        }
        System.out.println(count);
    }
}
