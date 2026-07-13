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
        ListNode dummy= new ListNode(0);
        dummy.next=head;
        ListNode tail=dummy;
        ListNode first;
        ListNode second;
        while(tail.next != null && tail.next.next!=null){
            first=tail.next;
            second=first.next;
            first.next=second.next;
            second.next=first;
            tail.next=second;
            tail=first;
        }
        return dummy.next;
        
    }
}