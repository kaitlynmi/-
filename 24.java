class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode prev = dummy;
        ListNode curr = head;
        while (curr != null){
            if (curr.next == null) {
                prev.next = curr;
            }
            else {
                ListNode remain = curr.next.next;
                prev.next = curr.next;
                curr.next.next = curr;
                curr.next = remain;
                prev = curr;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}

// 递归版本
class Solution2 {
    public ListNode swapPairs(ListNode head) {
        // base case 退出提交
        if(head == null || head.next == null) return head;
        // 获取当前节点的下一个节点
        ListNode next = head.next;
        // 进行递归
        ListNode newNode = swapPairs(next.next);
        // 这里进行交换
        next.next = head;
        head.next = newNode;

        return next;
    }
} 