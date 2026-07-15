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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int count=0;
        ListNode [] ans= new ListNode[k];
        ListNode curr=head;
        while(curr!=null){
            curr=curr.next;
            count++;
        }
        int base=count/k;
        int extra=count%k;
        ListNode cu= head;
       for(int i=0;i<k;i++){
            int size=0;
           
            if(extra>0){
                size=base+1;
                extra--;
            }
            else{
                size=base;
            }
             if(size==0){
                ans[i]=null;
                continue;
            }
            ans[i]=cu;
            ListNode prev=cu;
            ListNode tail=null;
            for(int j=0;j<size;j++){
                tail=prev;
                prev=prev.next;
            }
            tail.next=null;
            cu=prev;

        }

        return ans;
    }
}