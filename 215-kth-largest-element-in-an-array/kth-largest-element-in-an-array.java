class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
       // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());


        for(int val :  nums){
            pq.add(val);
            if(pq.size()>k){
                pq.remove();
            }
        }
       return pq.peek();
    }
}

/*  Max Heap
for(int val :  nums){
            pq.add(val);
        }
        for(int i=1;i<k;i++){
            pq.poll();
        }
        return pq.peek();*/
