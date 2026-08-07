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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head,prev=null,next=null;
        if(head==null){
            return null;
        }
        int c=k;
        while(temp!=null && c>0){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
            c--;
        }
        if(temp==null && c>0){
            temp=prev;
            prev=null;
            next=null;
            while(temp!=null){
                next=temp.next;
                temp.next=prev;
                prev=temp;
                temp=next;
            }
        }
        if(c>0){
            return prev; //for last element
        }
        head.next=reverseKGroup(temp,k);
        return prev;
    }
}