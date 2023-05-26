# LeetCode Bootcamp Day 3  
 with 代码随想录  
  [prev](./Day2.md) <--> [next](./Day4.md)

<!-- ### 对自己的话   -->
 >

### KEY POINTS

The  algorithms we visited today are **Sentinel Node** and **2**.


## [203. Remove Linked List Elements](https://leetcode.com/problems/remove-linked-list-elements/)  
Editorial: [203.移除链表元素](https://programmercarl.com/0203.%E7%A7%BB%E9%99%A4%E9%93%BE%E8%A1%A8%E5%85%83%E7%B4%A0.html#%E5%85%B6%E4%BB%96%E8%AF%AD%E8%A8%80%E7%89%88%E6%9C%AC)  
Solutions: [Recursion](./203_1.java)/[Sentinel Node](./203_2.java)

> 


### Approach 1: Recursion
1. If the head is null (indicating an empty list), return null.
2. If the value of the head node is equal to the given value (`val`), recursively call `removeElements` on the next node (`head.next`).
3. If the value of the head node is not equal to the given value (`val`), recursively call `removeElements` on the next node (`head.next`), and update the current head's next pointer to the returned result.
4. Finally, return the modified head node.

### Approach 2: Sentinel Node
The main purpose of a Sentinel Node is to standardize the situation. It avoids special handling to the head node. Therefore, when it comes to modifying the linked list (such as inserting, deleting, or moving nodes), a dummy node can be useful.  
However, when simply traversing the linked list, there is no need to include the Sentinel Node.

<!-- ### Additional Notes: -->


### Additional problems :   
- [146. LRU Cache](https://leetcode.com/problems/lru-cache/description/)
- [1161. Maximum Level Sum of a Binary Tree](https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree)

