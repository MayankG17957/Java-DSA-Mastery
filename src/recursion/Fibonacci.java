package recursion;

public class Fibonacci {

    public static int fib_Print(int n){
        if(n<2){
            return n;     //base case (we know the answer so we try to take those in the base case)
        }
        return fib_Print(n-1) + fib_Print(n-2);    //(recurrence relation)
    }

    public static void main(String[] args) {
        int ans = fib_Print(6);
        System.out.println(fib_Print(ans));
    }
}


//solving the recursion --

//1) identify if u can break down the prblm in the sub-prblm
//2) write the recurrence relation if needed
//3) draw the recursive tree
//4) about the tree:-

//4)a) see the flow of the functions , how they are getting in stack
//4)b) identify n focus on left tree calls and right tree calls
//4)c) draw the tree n pointers again n again using the pen n paper
//4)d) use a debugger to see the flow

//5) see how the value are returned & wht type of values (int , str, etc.)at each step see where two functions call will came out. in the end , u will come out of the tree

//6) variables:- a) arguments b) return type c) body of functions

