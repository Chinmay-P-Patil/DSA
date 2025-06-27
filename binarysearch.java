import java.util.*;

public class binarysearch {
    public static void main(String[] args){
        //binary search 
        // a searching algorith that finds the position of
        // a targeted value within a sorted array.
        // half of the array is eliminated during each "step"

        int[] array = new int[10];
        int target = 2;

        for(int i = 0; i<array.length;i++){
            array[i] = i;
        }

        //int index = Arrays.binarySearch(array, target);

        int index = binarySearch(array,target);

        System.out.println(index);

        
    }
    private static int binarySearch(int[] array, int target){

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            int value = array[middle];

            System.out.println(middle);
            if(value < target){
                low = middle + 1;
            }else if(value > target){
                high = middle - 1;
            }else{
                return middle;//target foud
            }

            
        }

        return -1;
    }
}
