class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->distance(b)-distance(a));//b-a beacuse max heap

        for(int[] point:points){
            pq.add(point);

            if(pq.size()>k){
                pq.poll();
            }
        }
        int[][] result = new int[k][2];//2 row and 2 column

        for(int i=0;i<k;i++){
            result[i]=pq.poll();
        }

        return result;
    }
    private int distance(int[] point){
            return point[0]*point[0] + point[1]*point[1];
        }
}