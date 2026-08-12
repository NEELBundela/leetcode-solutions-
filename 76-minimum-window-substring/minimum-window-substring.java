class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        Map<Character,Integer> window = new HashMap<>();

        int left=0,right=0,formed=0;

        int min = Integer.MAX_VALUE;
        int start = 0;

        while(right<s.length()){
            char c = s.charAt(right);

            window.put(c,window.getOrDefault(c,0)+1);
            if(map.containsKey(c) && window.get(c).equals(map.get(c))){
                formed++;
            }
            right++;
        

        while(formed==map.size()){
            int len = right-left;

            if(len<min){
                min=len;
                start=left;
            }
            char leftchar = s.charAt(left);

            window.put(leftchar,window.get(leftchar)-1);

            if(map.containsKey(leftchar) && window.get(leftchar)<map.get(leftchar)){
                formed--;
            }
            left++;
        }
    }
    if(min == Integer.MAX_VALUE){
        return "";
    }
    return s.substring(start,start+min);
    }
}