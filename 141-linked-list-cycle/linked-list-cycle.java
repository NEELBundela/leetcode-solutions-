/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // ListNode start=head;

        // while(start!=null){

        //     ListNode cur = start.next;

        //     while(cur!=null){

        //     if(cur==start){ // here cur.next will not take because 2==2
        //         return true;
        //     }
        //     cur=cur.next;
        // }
        // start=start.next;
        // }
        
        // return false;

        HashSet<ListNode> set = new HashSet<>();
        ListNode start = head;
        while(start!=null){
            if(set.contains(start)){
                return true;
            }
            set.add(start);
            start=start.next;
        }
        return false;
    }
}