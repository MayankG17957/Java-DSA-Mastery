package recursion;

public class ReverseNumber02 {

    static int rev2(int n){
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n , digits);  //sometimes u need some additional variables in the argument
    }                               //in this case make another function

    private static int helper(int n, int digits){
        if(n%10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }

    public static void main(String[] args) {
        System.out.println(rev2(1234));
    }
}
