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
        ListNode dummy= new ListNode(0);
        ListNode tail= dummy;
        ListNode first=l1;
        ListNode sec=l2;
        int carry=0;
        while(first!=null ||  sec!=null){
            int sum=carry;
            if(first!=null){
                sum+=first.val;
                first=first.next;
            }
            if(sec!=null){
                sum+=sec.val;
                sec=sec.next;
            }
            int digit=sum%10;
            carry=sum/10;
            tail.next= new ListNode(digit);
            tail=tail.next;
            
        }
        if(carry > 0) {
        tail.next = new ListNode(carry);
}
        return dummy.next;

    }
}