public class towerofhonai {
    public static void towersolve(int n, String src, String helper, String dest){

        if(n == 1){
            System.out.println("transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        towersolve(n-1, src, dest, helper);
        System.out.println("transfer disk "+n+" from "+src+" to "+dest);
        towersolve(n-1, helper, src, dest);
    }
    
    public static void main(String[] args){
        int n =3;
        towersolve(n, "S", "H", "D");
    }
}
