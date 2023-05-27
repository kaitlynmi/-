# LeetCode Bootcamp Day 3  
 with 代码随想录  
  [Table of Contents](./README.md)  
  [prev](./Day2.md) <--> [next](./Day4.md)

<!-- ### 对自己的话   -->
 >

### KEY POINTS

The  algorithms we visited today is **Sentinel Node** .


## [203. Remove Linked List Elements](https://leetcode.com/problems/remove-linked-list-elements/)  
Editorial: [203.移除链表元素](https://programmercarl.com/0203.%E7%A7%BB%E9%99%A4%E9%93%BE%E8%A1%A8%E5%85%83%E7%B4%A0.html#%E5%85%B6%E4%BB%96%E8%AF%AD%E8%A8%80%E7%89%88%E6%9C%AC)  
Solutions: [Recursion](./203_1.java)/[Sentinel Node](./203_2.java)

> 在需要移动链表的时候，用一个Sentinel Node会简介方便很多


### Approach 1: Recursion
1. If the head is null (indicating an empty list), return null.
2. If the value of the head node is equal to the given value (`val`), recursively call `removeElements` on the next node (`head.next`).
3. If the value of the head node is not equal to the given value (`val`), recursively call `removeElements` on the next node (`head.next`), and update the current head's next pointer to the returned result.
4. Finally, return the modified head node.

### Approach 2: Sentinel Node :star:
The main purpose of a Sentinel Node is to standardize the situation. It avoids special handling to the head node. Therefore, when it comes to modifying the linked list (such as inserting, deleting, or moving nodes), a dummy node can be useful.  
However, when simply traversing the linked list, there is no need to include the Sentinel Node.

<!-- ### Additional Notes: -->


### Additional problems :   
- [146. LRU Cache](https://leetcode.com/problems/lru-cache/description/)
- [1161. Maximum Level Sum of a Binary Tree](https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree)

## [707. Design Linked List](https://leetcode.com/problems/design-linked-list/)  
Editorial: [707.设计链表](https://programmercarl.com/0707.%E8%AE%BE%E8%AE%A1%E9%93%BE%E8%A1%A8.html#%E4%BB%A3%E7%A0%81)

> 一开始没有引用LinkedNode,写的非常痛苦。对于Class的设计已经太生疏了

- `MyLinkedList temp = head` 
  - only creates a shallow copy of the original. 
  - use `ListNode temp = new ListNode(val, head.next)`
- linkedList == null;
  - is always false; only variable `next` can be null
- The bound for `addAtIndex` is `i <= size`. `size` is included becuase a node can be added to the end and beginning of the list. If negative indices is not acceptable, then the bound is `0 <= i <= size`. 
- The bound for `deleteAtIndex` is `0 <= i <= size-1`. Only existing index can be deleted.
- Adding a sentinel node makes sure the structure could never be empty. It also helps reducing `AddAtHead` and `AddAtTail` to `addAtIndex`. 
  - If sentinel node is used. When you want to traverse the list to find i-th index, you have to add index by 1.



### Approach 1: Singly Linked List [code](./707_1.java)
it provides `addAtHead` in a constant time, and `addAtTail` in a linear time.

### Approach 2: Doubly Linked List
TBC


## [206. Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/)  
Editorial: [206.反转链表](https://programmercarl.com/0206.%E7%BF%BB%E8%BD%AC%E9%93%BE%E8%A1%A8.html#%E5%8F%8C%E6%8C%87%E9%92%88%E6%B3%95)  
Solution: [iterative](./206.java)

> 

### Approach 1: Iterative (Two Ponters)
The line `LinkedNode node = head;` assigns the value of `head` to the variable `node`. However, it's important to note that this assignment **does not create a new object or copy the object's data**. Instead, it creates a new reference `node` that points to the same object in memory as `head`.

As a result, both `head` and `node` are referring to the same object in memory. Any changes made to the object through one variable will be reflected when accessing the object through the other variable. This behavior occurs because objects in Java are reference types, and assigning an object to a variable simply copies the reference to the object, not the actual object data.

### Approach 2: Recursive
TBC



