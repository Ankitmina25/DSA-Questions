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
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode sec= slow.next;
        slow.next=null;
        ListNode prev=null;
        while(sec!=null){
            ListNode temp= sec.next;
            sec.next=prev;
            prev=sec;
            sec=temp;
        }
        ListNode newsc= prev;
        ListNode curr= head;
        while(newsc!=null){
            ListNode first =curr.next ;
            ListNode second= newsc.next;
            curr.next=newsc;
            newsc.next=first;
            curr=first;
            newsc=second;
        }
    }
}