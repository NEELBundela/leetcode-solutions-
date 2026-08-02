/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode prev = dummy;

        while(prev.next!=null && prev.next.next!=null){
            ListNode swap1=prev.next;
            ListNode swap2=prev.next.next;

            swap1.next=swap2.next;
            swap2.next=swap1;

            prev.next=swap2;//to connect second node with dummy
            prev=swap1;
        }
        return dummy.next;
    }
}