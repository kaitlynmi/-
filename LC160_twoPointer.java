/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LC160_twoPointer {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int aLength = getLength(headA);
        int bLength = getLength(headB);

        while(aLength > bLength){
            headA = headA.next;
            aLength--;
        }

        while(bLength > aLength){
            headB = headB.next;
            bLength--;
        }

        while(headA != null){
            if(headA == headB) return headA;
            else{
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
    }

    public int getLength(ListNode node){
        int n = 0;
        while(node != null){
            n++;
            node = node.next;
        }
        return n;
    }
}