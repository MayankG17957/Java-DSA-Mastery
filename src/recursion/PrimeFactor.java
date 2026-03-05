package recursion;

public class PrimeFactor {
    static void factor(int n){
         helper(n , 2);
    }

    private static void helper(int n , int m){
        if(n == 1) return ;
        if(n % m == 0){
            System.out.println(m);
            helper(n/m , m);
        }
        else{
             helper(n , m+1);
        }
    }
    public static void main(String[] args) {
        factor(12);
    }
}
