class Solution {
    // Creates a sentinel node at the beginning of list
    public ListNode removeElements(ListNode head, int val) {
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;

        ListNode prev = sentinel, curr = head;
            while (curr != null) {
                if (curr.val == val) prev.next = curr.next;
                else prev = curr;
                curr = curr.next;
            }
            return sentinel.next;
    }

    // Does not use a sentinel node
    public ListNode removeElements1(ListNode head, int val) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null){
            // removing head node
            if (curr.val == val && prev == null){
                head = curr.next;
                
            }
            // removing mid node
            else if (curr.val == val){
                prev.next = curr.next;
                
            }
            // moving to next node
            else {
                prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }

}