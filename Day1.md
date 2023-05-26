# LeetCode Bootcamp Day 1  
 with 代码随想录  

### 对自己的话  
 >无谓的等待是不会有任何的结果的。就算再害怕失败也要动起来。   
 >先从每天一小步开始吧！加油！

### Fundamentals of array. 
- An array is a collection of data of the same type stored in **contiguous memory space**.
- The memory addresses of the array elements are contiguous.
- The elements of an array cannot be deleted; they can only be overwritten.

The two algorithms we visited today are **Binary Search** and **Two Pointers**.


## [704. Binary Search 二分查找](https://leetcode.com/problems/binary-search/)  
Editorial: https://programmercarl.com/0704.%E4%BA%8C%E5%88%86%E6%9F%A5%E6%89%BE.html#_704-%E4%BA%8C%E5%88%86%E6%9F%A5%E6%89%BE  

> 很熟悉的基础算法了。主要是复健java。后续二刷可以用python写。（顺便学一下md  
> 不要因为开始简单就飘了哦！  
> 有时间对附加题也做个总结。

the main challenge for this question is the definition of intervals, and whether or not to include the ends.

### Approach 1: [`left`, `right`]  
In the first attempt, i defined the intervals to be [`left`, `right`] 左闭右闭. (both sides closed; disinclude all the elements i dont want).

The only change I made was to check the elements on both ends, in addition to the pivot point, in each loop. I believed that this would reduce the number of search iterations.

### Approach 2: [`left`, `right`) 
I also tried definitions like  [`left`, `right`) 左闭右开.  
In this case:
- the inital value of right is different. `right = nums.length`.
- `left` and `right` never overlapse. so change the while condition to: `while (left < right)`.
- include `middle` when we are choosing to look into the left subarray

### Additional Notes:
BINARY SEARCH
-  The essence of binary search is to narrow down the range of the answer based on whether it satisfies the conditions of the problem. 
-  It requires the array to be **sorted**.  
- The key advantage of binary search is its time complexity of** O(logn)**. Consider using it when encountering a sorted array.  
- The different definitions of the interval affect three aspects: 
  1. initialization of the pointers 
  2. loop termination condition
  3. method of updating the pointers
  
INTEGER OVERFLOW
```java
// may cause interger overflow, if left + right is greater than INT_MAX
int mid = (l + r) / 2 
// better options
int mid = left + ((right - left) >> 1);
int mid = left + ((right - left) / 2);
```

"`>>`" effectively divides the difference between `right` and `left` by 2 without risking exceeding the maximum value of an int. The "`>>`" operator preserves the sign of the dividend and performs a safe division that reduces the likelihood of overflow in scenarios where the difference is large.

### Additional problems :   
[34. Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)  :heavy_check_mark:  
[35. Search Insert Position](https://leetcode.com/problems/search-insert-position/):heavy_check_mark:  
69.x 的平方根  
367.有效的完全平方数

## [27. Remove Element 移除元素](https://leetcode.com/problems/remove-element/)  
Editorial: https://programmercarl.com/0027.%E7%A7%BB%E9%99%A4%E5%85%83%E7%B4%A0.html#_27-%E7%A7%BB%E9%99%A4%E5%85%83%E7%B4%A0  

### Approach: Two pointers
**Two pointers** is the key here. Using a writer pointer and a reader pointer to complete both jobs in one for-loop.

Use System.gc() can save memory space in some occassion. (look into this).

### Additional problems :   
[26. Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/):heavy_check_mark:  
283.移动零  
844.比较含退格的字符串  
977.有序数组的平方  