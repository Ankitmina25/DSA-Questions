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
        ListNode L= new ListNode(0);
        ListNode G= new ListNode(0);
        ListNode ls= L;
        ListNode gs= G;
        ListNode curr=head;
        while(curr!=null){
            if(curr.val<x){
                ls.next=curr;
                ls=ls.next;
                curr=curr.next;
            }else{
                gs.next=curr;
                gs=gs.next;
                curr=curr.next;
            }
        }
        ls.next=G.next;
        gs.next=null;
          return L.next;
    }
  
}