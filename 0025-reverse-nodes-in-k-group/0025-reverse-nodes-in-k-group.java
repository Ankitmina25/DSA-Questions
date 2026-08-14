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
    public ListNode rev(ListNode curr,int k){
        ListNode prev=null;
        ListNode cr= curr;
        while(cr!=null){
            ListNode temp= cr.next;
            cr.next=prev;
            prev=cr;
            cr=temp;
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
    ListNode temp= curr.next;
    curr.next=null;
    ListNode newHead= rev(head,k);
    head.next=reverseKGroup(temp,k);
    return newHead;
    }
}