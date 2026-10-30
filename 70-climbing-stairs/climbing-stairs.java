
import java.util.*;

class Solution {

    HashMap<Integer, Integer> map = new HashMap<>();

    public int climbStairs(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        if (map.containsKey(n)) {
            return map.get(n);
        }

        int a1 = climbStairs(n - 1);
        int a2 = climbStairs(n - 2);

        int ans = a1 + a2;

        map.put(n, ans);

        return ans;
    }
}
