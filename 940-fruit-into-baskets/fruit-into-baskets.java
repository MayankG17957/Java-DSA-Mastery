
import java.util.HashMap;

class Solution {
    public int totalFruit(int[] fruits) {
        int low = 0;
        int maxLen = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int high = 0; high < fruits.length; high++) {

            // Add the current fruit to the HashMap
            map.put(fruits[high],
                    map.getOrDefault(fruits[high], 0) + 1);

            // Shrink the window if there are more than 2 types
            while (map.size() > 2) {
                int fruit = fruits[low];

                map.put(fruit, map.get(fruit) - 1);

                // Remove the fruit type if its frequency becomes 0
                if (map.get(fruit) == 0) {
                    map.remove(fruit);
                }

                low++;
            }

            // Calculate the maximum window length
            maxLen = Math.max(maxLen, high - low + 1);
        }

        return maxLen;
    }
}
