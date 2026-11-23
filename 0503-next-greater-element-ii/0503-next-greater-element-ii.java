import java.util.*;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        
        Deque<Integer> stack = new ArrayDeque<>(); // Stores indices
        
        for (int i = 0; i < 2 * n; i++) {
            int currIdx = i % n;
            
            while (!stack.isEmpty() && nums[currIdx] > nums[stack.peek()]) {
                res[stack.pop()] = nums[currIdx];
            }
            
            if (i < n) {
                stack.push(currIdx);
            }
        }
        
        return res;
    }
}