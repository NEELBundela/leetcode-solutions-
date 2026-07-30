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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        while(head.next==null && head!=null && n==1){
            return null;
        }
        ListNode temp=head;
        ListNode prev=null;
        int count=0;
        
        int length=0;

        while(temp!=null){
            length++;
            temp=temp.next;
        }
        int pos=length-n;

        if(pos==0){
            return head.next;
        }
        ListNode cur=head;
        while(count<pos){
           prev=cur;
           cur=cur.next;
           count++;
        }
        prev.next=cur.next;

        return head;
    }
}