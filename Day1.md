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

In the first attempt, i defined the intervals to be [left, right]. (both sides closed; disinclude the all the elements i dont want).

The only change i made was to check the elements on the two ends along with the piviot point in each loop. I feel like this would decrease the numeber of search time, but the change is minor. 

I also tried definitions like  [left, right).

### Additional problems completed:   
[34. Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)  
[35. Search Insert Position](https://leetcode.com/problems/search-insert-position/)  
69.x 的平方根  
367.有效的完全平方数

## [27. Remove Element 移除元素](https://leetcode.com/problems/remove-element/)  
Editorial: https://programmercarl.com/0027.%E7%A7%BB%E9%99%A4%E5%85%83%E7%B4%A0.html#_27-%E7%A7%BB%E9%99%A4%E5%85%83%E7%B4%A0  

**Two pointers** is the key here. Using a writer pointer and a reader pointer to complete both jobs in one for-loop.

Use System.gc() can save memory space in some occassion. (look into this).

### Additional problems :   
[26. Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)  
283.移动零  
844.比较含退格的字符串  
977.有序数组的平方  