package recursion;

public class DigitSum {
    static int giveSum(int n){
        if(n<1) return 0;
        return n%10 + giveSum(n/10);
    }

    public static void main(String[] args) {
        System.out.println(giveSum(123456));
    }
}
