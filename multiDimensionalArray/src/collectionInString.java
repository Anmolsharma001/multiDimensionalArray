import java.util.ArrayList;
import java.util.Collections;
class collectionInString//
{
   /* static void reverse(ArrayList<Integer> list) {
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
    */

    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Welcome");
        l1.add("To");
        l1.add("Physics");
        l1.add("Wallah");
        System.out.println("OG" + l1);
        Collections.sort(l1);
        System.out.println("sorted" + l1);
    }
}