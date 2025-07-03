import java.util.*;

public class hashing {
    public static void main(){
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);
        System.out.println(set.size());

        System.out.println(set.contains(1));
        System.out.println(set.contains(6));

        set.remove(1);

        System.out.println(set);

        //iterator
        Iterator it = set.iterator();

        //hasnext and next
        while(it.hasNext()){
            System.out.println(it.next()); 
            //this may print unorderd set 
        }

    }
}
