
import java.util.*;

class Solution {

    HashMap<Integer, Integer> dp = new HashMap<>();

    public int fib(int n) {

        if (n == 0) return 0;
        if (n == 1) return 1;

        // Check if answer is already calculated
        if (dp.containsKey(n)) {
            return dp.get(n);
        }

        int a1 = fib(n - 1);
        int a2 = fib(n - 2);

        int ans = a1 + a2;

        // Store the calculated answer
        dp.put(n, ans);

        return ans;
    }
}
