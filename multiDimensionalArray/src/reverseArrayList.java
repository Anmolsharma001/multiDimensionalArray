import java.util.ArrayList;
class reverseArrayList
{
    static void reverseList(ArrayList<Integer>list)
    {
        int i=0,j=list.size()-1;
        while(i<j)
        {
            Integer temp=Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }
    public static void main(String[]args)
    {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println("original list"+list);
        reverseList(list);
        System.out.println("reverse list"+list);
    }
}
