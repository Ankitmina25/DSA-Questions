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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode slow=head;
        if(head ==null || head.next==null) return head;
        ListNode fast=head;
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        k=k%len;
        if(k==0) return head;
        for(int i=0;i<k;i++){
            fast=fast.next;
        }
        ListNode pre=null;
        while(fast!=null){
            pre=slow;
            fast=fast.next;
            slow=slow.next;
        }
        pre.next=null;
        ListNode newhead= slow;
        ListNode curr=slow;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=head;
        head=newhead;
        return head;
    }
}