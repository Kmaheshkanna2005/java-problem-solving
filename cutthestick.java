import java.util.*;
public class cutthestick
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(4);
        list.add(2);
        list.add(8);
        System.out.println(list);
        while(true)
        {
        int min = Integer.MAX_VALUE;
        for(int num : list)
        {
            if(num<min)
            {
                if(num==0)
                {
                    continue;
                }
                min = num;
            }
        }
        System.out.println("the min element in the list = "+min);
        int count = 0;
        int temp=0;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)==0)
            {
                temp++;
            }
            else{
                int get = list.get(i);
                get = get-min;
                list.set(i,get);
                count++;
            }   
        }
        System.out.println("the element in the after sub list");
        System.out.println(list);
        
        System.out.println("the number of times the sub  = "+count);
        if(temp==list.size()-1)
        {
            break;
        }
    }
    }
}