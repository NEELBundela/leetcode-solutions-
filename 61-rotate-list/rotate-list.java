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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        int length=0;
        if(head==null || head.next==null){
            return head;
        }

        while(temp!=null){
                length++;
                temp=temp.next;
            }

        
        ListNode prev=null;
        k=k%length;
        for(int i=0;i<k;i++){
            temp=head;
            prev=null;
            while(temp.next!=null){
                prev=temp;
                temp=temp.next;
            }
            prev.next=null;
            temp.next=head;
            head=temp;
        }
        return head;
    }
}