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
        if (head==null || head.next==null) return head;
        ListNode node=head;
        int len=0;
        while(node!=null){
            len++;
            node=node.next;
        }
        k=k%len;
        for(int i=0;i<k;i++){
            ListNode curr=head;
            ListNode prev=null;
            while(curr.next!=null){
                prev=curr;
                curr=curr.next;
            }
            curr.next=head;
            prev.next=null;
            head=curr;
        }
        return head;
    }
}