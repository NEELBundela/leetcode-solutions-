class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        Map<Character,Integer> map = new HashMap<>();
        Map<Character,Integer> window = new HashMap<>();

        for(char c : p.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int left = 0;

        for(int right =0;right<s.length();right++){

            char c = s.charAt(right);

            window.put(c,window.getOrDefault(c,0)+1);

            if(right-left+1>p.length()){
                char leftchar = s.charAt(left);

                window.put(leftchar,window.get(leftchar)-1);
            
            if(window.get(leftchar)==0){
                window.remove(leftchar);
            }
            left++;
            }
        
        if(window.equals(map)){
            result.add(left);
        }
        }
        return result;
    }
}