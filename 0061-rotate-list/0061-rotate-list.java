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
      if (head == null || head.next == null || k == 0) return head;
        int length=1;
        ListNode curr=head;
        while(curr.next!=null){
            curr=curr.next;
            length++;
        }
        int count= k%length;
        if(count==0) return head;
          ListNode slow=head;
        ListNode fast= head;
        for(int i=0;i<count;i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        ListNode tail=slow.next;
        slow.next=null;
        fast.next=head;
        return tail;
    }
}