
import java.util.ArrayList;//array list h or isme hum collections ka use
import java.util.Collections;//karte h to usse easy ho jata h solve
class collectionUse//
{
    static void reverse(ArrayList<Integer> list) {
        int i = 0;
        int j = list.size() - 1;
        while (i < j) {
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
      ArrayList<Integer>list=new ArrayList<>();
      list.add(0);
      list.add(12);
      list.add(34);
      list.add(345);
        System.out.println("reverse List"+list);//reverse se jp value di h vo
        Collections.reverse(list);// reverse ho jayengi
        System.out.println("reversed list"+list);//collection se hum sort kar sakte h
        Collections.sort(list);
        System.out.println("Ascending Order"+list);//ascending or descending
        Collections.sort(list,Collections.reverseOrder());//order me sort
        System.out.println("desecnding order"+list);


    }
}