class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack();
        int maxa=0;

        for(int i=0;i<=heights.length;i++){

            int currheight= (i==heights.length) ? 0 : heights[i];
            while(!stack.isEmpty() && currheight<heights[stack.peek()]){
                int height = heights[stack.pop()];
                int width;

                if(stack.isEmpty()){
                    width=i;
                }else{
                    width=i-stack.peek()-1;
                }

                int area =  width*height;
                maxa=Math.max(maxa,area);
            }
            stack.push(i);
        }
        return maxa;
    }
}