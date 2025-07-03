import java.util.*;

public class power {
    //x to the power n
    //not good bigger n
    // public static int calpower(int x, int n){
    //     if(n == 0){
    //         return 1;
    //     }
    //     if(x == 0){
    //         return 0;
    //     }
    //     int xpowernm1 = calpower(x, n-1);
    //     int xpow = x * xpowernm1;
    //     return xpow;
    // }

    public static int calpower(int x, int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        if(n % 2 ==0){
            return calpower(x, n/2) * calpower(x, n/2);
        }else{
            return calpower(x, n/2) * calpower(x, n/2) * x;
        }
    }  

    /*  
     * memory  stack
     * 
     */

    public static void main(String[] args){
        int x=2,n=5;
        int ans = calpower(x, n);
        System.err.println(ans);
    }
}
