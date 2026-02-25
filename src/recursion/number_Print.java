package recursion;

public class number_Print {

    static void print_Num(int n){
        if(n == 5) {
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print_Num(n+1);

    }

    public static void main(String[] args) {
        print_Num(1);
    }
}
