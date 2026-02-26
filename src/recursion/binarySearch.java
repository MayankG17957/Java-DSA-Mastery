package recursion;

import com.sun.security.jgss.GSSUtil;

public class binarySearch {

    static int binary_Search(int[] arr , int target , int s , int e){   // variables these are used in every call
        if(s>e){
            return -1;    //base case
        }
        int m = s + (e - s) / 2;
        if(arr[m] == target){
            return m;
        }
        if(target < arr[m]){
            return binary_Search(arr, target, s, m);     //return type
        }
        return binary_Search(arr, target, m+1, e);
    }
    public static void main(String[] args) {
        int[] arr = { 1 ,3,4,6,78,99,5};
        int target = 78;
        System.out.println(binary_Search(arr , target , 0 , arr.length-1));
    }
}


//types of recurrence relation --
//1)linear relation -- fibonacci
//2)divide n conquer relation(returned by a factor) -- binarySearch

