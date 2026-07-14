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
    public ListNode reverse(ListNode head){
        ListNode c=head;
        ListNode prev=null;
        while(c!=null ){
            ListNode tmp= c.next;
            c.next=prev;
            prev=c;
            c=tmp;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        int count=0;
        ListNode curr=head;
        while(curr!=null){
            curr=curr.next;
            count++;
        }
        if(count<k) return head;
         count=1;
        curr=head;
        while(count<k){
            curr=curr.next;
            count++;
        }
        ListNode temp = curr.next;
        curr.next=null;
        ListNode newHead= reverse(head);
        head.next=reverseKGroup(temp,k);
        return newHead;
    }
}