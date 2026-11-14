class Solution {
    public int myAtoi(String s) {
        int i =0;
        int n = s.length();

        while(i<n && s.charAt(i)==' '){
            i++;
        }

        int sign = 1;
        if(i<n && s.charAt(i)=='-'){
            sign = -1;
            i++;
        }else if(i<n && s.charAt(i)=='+'){
            i++;
        }

        long number =  0;

        while (i < n && Character.isDigit(s.charAt(i))) {

            int digit = s.charAt(i) - '0';

            number = number * 10 + digit;

            
            if (number > Integer.MAX_VALUE) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            i++;
        }
        return (int)(number*sign);
    }
}