import java.util.*;

public class LinkAndArrayList {
    public static void main(String[] args){

        //arraylist are faster then linked list except removing the first elemnt 
        LinkedList<Integer> linkedlist = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        long starttime, endtime, elapsedtime;

        starttime = System.nanoTime();
        for(int i=0;i<1000000;i++){
            linkedlist.add(i);
            arrayList.add(i);
        }

       
        endtime = System.nanoTime();

        elapsedtime = endtime - starttime;

        System.out.println(elapsedtime);

    }
}
