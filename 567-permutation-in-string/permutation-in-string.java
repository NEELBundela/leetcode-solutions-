class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> map = new HashMap<>();

        for(char ch : s1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        Map<Character,Integer> window = new HashMap<>();
        int left = 0;

        for(int right = 0;right<s2.length();right++){
            char c = s2.charAt(right);

            window.put(c,window.getOrDefault(c,0)+1);

            if(right-left+1>s1.length()){//3>2 "eid"
                char leftchar = s2.charAt(left);//e
                    //window = {e=1}  {}
                window.put(leftchar,window.get(leftchar)-1);//{e=0}

                if(window.get(leftchar)==0){
                    window.remove(leftchar);
                }

                left++;
            }
            if(window.equals(map)){
                return true;
            }
        }
        return false;
    }
}