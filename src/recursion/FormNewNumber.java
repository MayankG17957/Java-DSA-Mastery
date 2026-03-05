package recursion;

public class FormNewNumber {
    static int newNumber(int n){
        if(n == 0 ) return 0;
        int rem = n%10;
        int result = newNumber(n / 10);

        if(rem % 2 == 0){
            return result * 10 + rem;
        }
        else{
            return result;
        }


}
    public static void main(String[] args) {
        System.out.println(newNumber(123344));
    }
}
