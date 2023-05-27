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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        nthFromEnd(dummy, n);
        return dummy.next;  
    }

    public int nthFromEnd(ListNode node, int target){
        if(node.next == null) return 0;
        int nth = nthFromEnd(node.next, target) +1;
        if (nth == target) {
            node.next = node.next.next;
        }
        return nth;
    }
}