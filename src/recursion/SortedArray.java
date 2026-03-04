package recursion;

public class SortedArray {

    static boolean sorted(int []arr, int idx){
        if(idx == arr.length-1){
            return true;
        }
        return arr[idx] < arr[idx + 1] && sorted(arr , idx+1);
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6};
        System.out.println(sorted(arr,0));
    }
}
