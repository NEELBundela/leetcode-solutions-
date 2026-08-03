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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp = head;
        ListNode prev=dummy;

        for(int i=1;i<left;i++){
            prev=prev.next;
            temp=temp.next;
       }

       ListNode conn=prev;
       ListNode tail=temp;

       for(int i=0;i<right-left+1;i++){  //4-2+1 = 3 nodes we reverse
        ListNode next=temp.next;
        temp.next=prev;
        prev=temp;
        temp=next;
        
       }
       conn.next=prev;
       tail.next=temp;
        return dummy.next;
        
    }
}