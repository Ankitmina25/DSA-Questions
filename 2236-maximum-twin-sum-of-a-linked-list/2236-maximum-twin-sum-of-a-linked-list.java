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
        ListNode curr=head;
        ArrayList<Integer> arr= new ArrayList<>();
        while(curr!=null){
                arr.add(curr.val);
                curr=curr.next;
        }
        int left=0;
        int right=arr.size()-1;
        int maxy=Integer.MIN_VALUE;
        while(left<=right){
            int sum= arr.get(left)+arr.get(right);
            maxy=Math.max(maxy,sum);
            left++;
            right--;
        }
        return maxy;
    }
}