package recursion;

public class DigitProduct {

    static int productNum(int n){
        if(n % 10 == n){ return n;}
        return n%10 * productNum(n/10);
    }
    public static void main(String[] args) {
        System.out.println(productNum(1234));
    }
}
