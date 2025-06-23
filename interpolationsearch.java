import java.util.*;

public class interpolationsearch {
    public static void main(String[] args){
        //interpolation search = improvement over binary search 
        //    best used for "uniformly" distributed "guesses" 
        //    where a value might be based on calculated probe 
        //    results if probe is incorrect, we narrow the search 
        //    and try again

        //    average case : O(log(log(n)))
        //    worst case : O(n) [values increase exponentially]

        int[] array = {1,2,4,8,16,32,64,128,256,512,1024};

        int index = interpolation(array,256);

        System.out.println(index);
    }

    private static int interpolation(int[] array, int value){
        
        int high = array.length - 1;
        int low = 0;

        while (value >= array[low] && value <= array[high] && low<high) {
            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);

            System.out.println(probe);

            if(array[probe] == value){
                return probe;
            }else if(array[probe] < value){
                low = probe + 1;
            }else{
                high = probe - 1;
            }
        }

        return -1;
    }
}
