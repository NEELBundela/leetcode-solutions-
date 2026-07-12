class Solution {
    public int romanToInt(String s) {

        int ans=0,i;
        HashMap<Character,Integer> map = new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        for( i=0;i<s.length();i++){
            int current = map.get(s.charAt(i));
        
        if (i < s.length() - 1) {

                int next = map.get(s.charAt(i + 1));

                // Special case like IV, IX, XL...
                if (current < next) {
                    ans -= current;
                } else {
                    ans += current;
                }

            } else {
                // Last character
                ans += current;
            }
        }
        return ans;

        }
       // return ans;

    }
