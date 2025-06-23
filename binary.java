import java.util.*;

public class binary {
    public static void main(String[] args){
        // get bit
        int n=5; //101
        int pos=2;

        int bitmask = 1<<pos; //100

        if((bitmask & n) == 0){ //100 & 101
            System.out.println("bit was zero");
        }else{
            System.out.println("bit is one");
        }

        System.out.println(n);
        //set bit
        
        int x = 5;
        int posi = 1;
        int bitmas = 1<<posi;

        int newnumber = bitmas | x;
        System.out.println(newnumber);
    }
}
