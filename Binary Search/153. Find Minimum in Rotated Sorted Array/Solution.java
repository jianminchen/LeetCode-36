// 2018.4.26
class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int target = nums[nums.length - 1];
        
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                end = mid;   
            }
            else {
                start = mid;
            }
        }
        
        if (nums[start] <= target) {
            return nums[start];
        }
        else {
            return nums[end];
        }
    }
}