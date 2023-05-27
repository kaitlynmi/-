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
// my ITERATIVE SOLUTION
// creates a shadow of each node and change direction
 class Solution {
    public ListNode reverseList(ListNode head) {
        if (head ==null) return null;
        ListNode newHead = new ListNode(head.val);
        while (head.next != null){
            ListNode newNode = new ListNode(head.next.val);
            newNode.next = newHead;
            newHead = newNode;
            head = head.next;
        }
        return newHead;
    }
}

// SAMPLE ITERATIVE SOLUTION
class Solution2 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}