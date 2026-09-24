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
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        ListNode slow=head;
       
        while(slow!=null && slow.next!=null){
            ListNode fast=slow.next;
            tail.next=fast;
            tail=tail.next;
            slow.next=fast.next;
            tail.next=slow;
            tail=tail.next;
            slow=slow.next;
        }
        tail.next=slow;
        return dummy.next;
    }
}