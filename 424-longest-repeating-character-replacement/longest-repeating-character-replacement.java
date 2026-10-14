import java.util.*;

class Solution {
    public int characterReplacement(String s, int k) {

        int low = 0;
        int maxLen = 0;
        int maxFreq = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int high = 0; high < s.length(); high++) {

            char num = s.charAt(high);

            map.put(num, map.getOrDefault(num, 0) + 1);

            maxFreq = Math.max(maxFreq, map.get(num));

            while ((high - low + 1) - maxFreq > k) {

                char leftChar = s.charAt(low);

                map.put(leftChar, map.get(leftChar) - 1);

                low++;
            }

            maxLen = Math.max(maxLen, high - low + 1);
        }

        return maxLen;
    }
}