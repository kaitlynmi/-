class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int lowerBound = -1;
        int upperBound = -1;

        // Binary search to find the target value
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                lowerBound = mid;
                upperBound = mid;
                break;
            }
        }

        // Expand the lower and upper bounds
        while (lowerBound > 0 && nums[lowerBound - 1] == target) {
            lowerBound -= 1;
        }
        while (upperBound < nums.length - 1 && nums[upperBound + 1] == target) {
            upperBound += 1;
        }

        // Return the lower and upper bounds as an array
        return new int[]{lowerBound, upperBound};
    }
}