class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low = 0;
        int maxLen = 0;
        int high;
        HashMap<Character , Integer> map = new HashMap<>();
        for(high =0;high <s.length();high++){
            char ch = s.charAt(high);
            map.put(ch , map.getOrDefault(ch , 0)+1);

            while(map.get(ch)>1){
                char num = s.charAt(low);
                map.put(num , map.get(num)-1);

                if(map.get(num) == 0){
                    map.remove(num);
                }
                low++;
            }
            maxLen = Math.max(maxLen , high  - low+1);
        }
        return maxLen;
    }
}