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
    public ListNode partition(ListNode head, int x) {
        ListNode LNode= new ListNode(0);
        ListNode GNode= new ListNode(0);
        ListNode s=LNode;
        ListNode g=GNode;
        ListNode curr=head;
        while(curr!=null){
            if(curr.val<x){
                s.next=curr;
                s=s.next;
                curr=curr.next;

            }else{
                g.next=curr;
                g=g.next;
                curr=curr.next;
            }
        }
        s.next=GNode.next;
        g.next=null;
        return LNode.next;

        
    }
}