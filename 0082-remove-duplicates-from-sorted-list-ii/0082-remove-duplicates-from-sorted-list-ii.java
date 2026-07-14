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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy= new ListNode(0);
        ListNode tail=dummy;
        ListNode curr=head;
        if(head == null  || head.next==null) return head;
        while(curr!=null){
            boolean dup=false;
            while(curr.next!=null && curr.val==curr.next.val){
            dup=true;
            curr=curr.next;
            }
            
            if(dup){
                curr=curr.next;
            }
            else{
                tail.next=curr;
                tail=curr;
                curr=curr.next;
            }
            tail.next=null;
        }
        return dummy.next;
    }
}