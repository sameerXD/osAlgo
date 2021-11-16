import java.util.*;

class  Power {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int sol = power(x,n);
        System.out.print(sol);
    }

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        
        int sol =x* power(x, n-1);
        
        return sol;
    }
}