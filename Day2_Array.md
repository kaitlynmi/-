# LeetCode Bootcamp Day 2  
 with 代码随想录  

### 对自己的话  
 > 不知道现在找实习还来不来的及。   
 > 经过一周的积极练车，昨天把驾照考出来了！所以机会只会留给有准备的人，所以别松懈！要记住这种感觉

The algorithms we visited today are  **Two Pointers**, **Sliding Windows** and **Simulation**.


## [977. Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/)  
Editorial: [977.有序数组的平方](https://programmercarl.com/0977.%E6%9C%89%E5%BA%8F%E6%95%B0%E7%BB%84%E7%9A%84%E5%B9%B3%E6%96%B9.html#%E5%8F%8C%E6%8C%87%E9%92%88%E6%B3%95)

> 一开始因为昨天的题，一直想从左到右去排序数组。后来看了答案才发现，要找到规律。Two pointer不一定只能用来读写，也可以用从不同的方向来比较参数。从原始的数组里依次找到需要的数,再继续操作

### Approach: Two pointers  
The largest square are always at the two ends of the array. We have to compare the values at two ends with two pointers, and gradually narrowing the array to the middle.


## [209. Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum/)  
Editorial: [209.长度最小的子数组](https://programmercarl.com/0209.%E9%95%BF%E5%BA%A6%E6%9C%80%E5%B0%8F%E7%9A%84%E5%AD%90%E6%95%B0%E7%BB%84.html#%E6%9A%B4%E5%8A%9B%E8%A7%A3%E6%B3%95)  
My Solution: [O(n) solution](./209_O(n).java)/[O(nlogn) solution](./209_O(nlog).java)
>不是很熟练。看着solution写的。后续需要回顾

### Approach: Sliding Window  
![209](./209.gif)  
A sliding window is achieved by using two pointers `left` and `right`, which point to the starting and ending indices of the subarray. We set them to a value of 0.

To "add" elements to the window, we loop over the array by incrementing `right`. To minimize the array size, we then increment `left` if the sum of the subarray is still larger than `target`.


### Adavanced approach: Sliding Window + Binary Search    
This approach uses Binary Search to find an optimistic array length, and sliding window to check the length is valid. 
```java
public int minSubArrayLen(int target, int[] nums) {
    int low=1;
    int high=nums.length+1;
    boolean flag=false;
    while(low<high){
        int mid=low+(high-low)/2;
        if(fixsw(mid,nums,target)==true){
            flag=true;
            high=mid;
        }
        else
            low=mid+1;
    }
    if(!flag)
        return 0;
    return low;
}
public boolean fixsw(int size,int[] nums,int target){
    int i=0;
    int j=0;
    int sum=0;
    int max=Integer.MIN_VALUE;
    while(j<nums.length){
        sum+=nums[j];
        if(j-i+1==size){
            max=Math.max(max,sum);
            sum-=nums[i];
            i++;
        }
        j++;
    }
    if(max>=target){
        return true;
    }
    return false;
}
```
### Additional problems :   
- 904.水果成篮  
- 76.最小覆盖子串

## [59. Spiral Matrix II](https://leetcode.com/problems/spiral-matrix-ii/)  
Editorial: [59.螺旋矩阵II](https://programmercarl.com/0059.%E8%9E%BA%E6%97%8B%E7%9F%A9%E9%98%B5II.html#_59-%E8%9E%BA%E6%97%8B%E7%9F%A9%E9%98%B5ii)  
My Solution: [solution 1](./59.java)

### Approach 1: Traverse Layer by Layer in Spiral Form  
```java
public int[][] generateMatrix(int n) {
    int loop = 0;  // 控制循环次数
    int[][] res = new int[n][n];
    int start = 0;  // 每次循环的开始点(start, start)
    int count = 1;  // 定义填充数字
    int i, j;

    while (loop++ < n / 2) { // 判断边界后，loop从1开始
        // 模拟上侧从左到右
        for (j = start; j < n - loop; j++) {
            res[start][j] = count++;
        }

        // 模拟右侧从上到下
        for (i = start; i < n - loop; i++) {
            res[i][j] = count++;
        }

        // 模拟下侧从右到左
        for (; j >= loop; j--) {
            res[i][j] = count++;
        }

        // 模拟左侧从下到上
        for (; i >= loop; i--) {
            res[i][j] = count++;
        }
        start++;
    }

    if (n % 2 == 1) {
        res[start][start] = count;
    }

    return res;
}
```
The sample solution uses four separate for loops to simulate the four sides of the matrix in a spiral manner. It iterates over each side and fills in the values accordingly. However, defining the intervals can be challenging.  


### Approach 2: Optimized spiral traversal  
>一开始 i,j 的横竖关系搞混了（太蠢啦！）但是最后把自己的发现的规律总结后优化了算法 真的超成就感！  

In my program, I used two increments (horizontal and vertical) to define the direction of the writer. I recognized the looping pattern in the turning directions and the relationships between horizontal and vertical increments. I only need to check for bounds and written blocks in this case. I feel like my program is simpler and more sophsicated. 

### More Problems:
- 54.螺旋矩阵  
- 剑指Offer 29.顺时针打印矩阵