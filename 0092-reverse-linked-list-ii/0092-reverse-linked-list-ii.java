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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode l=head;
        ListNode r=head;
        ListNode first=null;
        ListNode second=head;
        for(int i=1;i<left;i++){
            first=l;
            l=l.next;
        }
        for(int i=1;i<right;i++){
            r=r.next;
        }
        second=r.next;
        ListNode curr=l;
        ListNode prev=null;
        while(curr!=second){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        if(first==null) head=prev;
        else first.next=prev;
        l.next=second;
        return head;

    }
}