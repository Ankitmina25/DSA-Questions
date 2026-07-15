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
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        ListNode tail=null;
        ListNode curr=slow;
        while(curr!=null){
            ListNode temp= curr.next;
            curr.next=tail;
            tail=curr;
            curr=temp;
        }
        int maxy=Integer.MIN_VALUE;
        ListNode c=head;
        while(c!=null && tail!=null){
            int sum= c.val+tail.val;
            maxy=Math.max(maxy,sum);
            c=c.next;
            tail=tail.next;
        }
        return maxy;
    }
}