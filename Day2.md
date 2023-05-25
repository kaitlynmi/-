# LeetCode Bootcamp Day 2  
 with 代码随想录  

### 对自己的话  
 > 不知道现在找实习还来不来的及。
 > 经过一周的积极练车，昨天把驾照考出来了！所以机会只会留给有准备的人，所以别松懈！要记住这种感觉

The two algorithms we visited today are  **Two Pointers**.


## [977. Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/)  
Editorial: https://programmercarl.com/0977.%E6%9C%89%E5%BA%8F%E6%95%B0%E7%BB%84%E7%9A%84%E5%B9%B3%E6%96%B9.html#%E5%8F%8C%E6%8C%87%E9%92%88%E6%B3%95

> 一开始因为昨天的题，一直想从左到右去排序数组。后来看了答案才发现，要找到规律。Two pointer不一定只能用来读写，也可以用从不同的方向来比较参数。从原始的数组里依次找到需要的数,再继续操作

### Approach: Two pointers  
The largest square are always at the two ends of the array. We have to compare the values at two ends with two pointers, and gradually choose and move the pointers inwards. 


## [209. Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum/)  
Editorial: [209.长度最小的子数组](https://programmercarl.com/0209.%E9%95%BF%E5%BA%A6%E6%9C%80%E5%B0%8F%E7%9A%84%E5%AD%90%E6%95%B0%E7%BB%84.html#%E6%9A%B4%E5%8A%9B%E8%A7%A3%E6%B3%95)

### Approach: Sliding Window  
![209]("https://github.com/kaitlynmi/Leetcode-Bootcamp/blob/main/209.gif")


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
904.水果成篮  
76.最小覆盖子串

