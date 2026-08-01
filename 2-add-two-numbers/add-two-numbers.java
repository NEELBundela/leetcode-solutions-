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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // ListNode sum1 = null;
        // while(l1!=null && l2!=null){
        //     int sum=l1.val+l2.val;
        //     sum1.val=sum;
        // }
        // l1=l1.next;
        // l2=l2.next;
        // return sum1;

        ListNode dummy = new ListNode(0);
        ListNode sum1=dummy;

        int carry=0;

        while(l1!=null || l2!=null){

            int sum=carry;

            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }

            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }

            carry=sum/10;

            sum1.next=new ListNode(sum%10);
            sum1=sum1.next;

        }
        if(carry>0){
            sum1.next=new ListNode(carry);
        }
        return dummy.next;
    }
}