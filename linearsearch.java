import java.util.*;

public class linearsearch {
    public static void main(String[] args){

        //O(n)

        //disadvantages:-
        //slow for large data sets

        //advantages:-
        //fast for searches of small to medium data sets
        //does need to sorted
        //useful for data structures that do not have random access (linked list)

        int[] array = {9,1,8,2,7,3,6,4,5};

        int index = linear(array, 1);
        System.out.println("position of 1 is " + index);

    }
    private static int linear(int[] array, int n){

        for(int i =0; i<array.length;i++){
            if(array[i]==n){
                return i;
            }
        }

        return -1 ;
    }
}
