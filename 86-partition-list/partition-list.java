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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);

        ListNode small=dummy1;
        ListNode large=dummy2;

        ListNode curr = head;

        while(curr!=null){
            ListNode next = curr.next;
            curr.next=null; //disconnect

            if(curr.val<x){
                small.next=curr;
                small=small.next;
            }else{
                large.next=curr;
                large=large.next;
            }

            curr=next;
        }
        small.next=dummy2.next;

        return dummy1.next;
    }
}