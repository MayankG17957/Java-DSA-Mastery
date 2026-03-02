package recursion;

public class ReverseNumber01 {
    static int sum = 0;

    static void reverseNum(int n){
        if(n == 0) return;
        int remainder = n%10;
        sum = sum * 10 + remainder;
        reverseNum(n/10);
    }
    public static void main(String[] args) {
        reverseNum(1234);
        System.out.println(sum);
    }
}