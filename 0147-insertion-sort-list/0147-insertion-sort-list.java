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
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy=new ListNode(0);
        if(head==null ||head.next==null) return head;
        ListNode curr=head;
        while(curr!=null){
            ListNode prev=dummy;
            while(prev.next!=null && curr.val>prev.next.val){
                prev=prev.next;
            }
            ListNode fow= curr.next;
            ListNode tail=prev.next;
            prev.next=curr;
            curr.next=tail;
            curr=fow;
        }
        return dummy.next;
    }
}