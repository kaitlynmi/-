// Singly Linked List
class MyLinkedList {
    int size;
    ListNode head;

    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }
    
    public int get(int index) {
        if (index >= size || index < 0) return -1;
        ListNode pred = head;
        for(int i = 0; i < index; ++i) pred = pred.next;
        return pred.next.val;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0, val);
        // ListNode newNode = new ListNode(val, head.next);
        // head.next = newNode;
        // size ++;
    }
    
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index > size) return;
        // [so weird] If index is negative, 
        // the node will be inserted at the head of the list.
        if (index < 0) index = 0;

        ++size;
        // find predecessor of the node to be added
        ListNode pred = head;
        for(int i = 0; i < index; ++i) pred = pred.next;

        // node to be added
        ListNode toAdd = new ListNode(val, pred.next);
        // insertion itself
        pred.next = toAdd;
    }
    
    public void deleteAtIndex(int index) {
        if(index >= size || index < 0) return;
        size--;
        // find predecessor of the node to be deleted
        ListNode pred = head;
        for(int i = 0; i < index; ++i) pred = pred.next;

        pred.next = pred.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */