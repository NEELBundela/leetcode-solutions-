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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode second = slow.next;//store 4->5
        slow.next=null;//it disconnect 123 and 45

        ListNode prev=null;
        ListNode curr=second;

        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode first = head;
         second = prev;
        
        
         while(second!=null){//shorter length node

         ListNode temp1=first.next;  //to save 2 and 4
        ListNode temp2=second.next;
            first.next=second;
            second.next=temp1;

            first=temp1;
            second=temp2;
    }
}
}