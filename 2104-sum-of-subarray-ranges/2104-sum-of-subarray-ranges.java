
class Solution {
    public long subArrayRanges(int[] nums) {
        return sumMax(nums) - sumMin(nums);
    }

    public long sumMax(int[] nums) {
        int n = nums.length;
        long sum = 0;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i <= n; i++) {
            while (!st.isEmpty() &&
                   (i == n || nums[st.peek()] < nums[i])) {

                int mid = st.pop();

                int left = st.isEmpty() ? -1 : st.peek();
                int right = i;

                long count = (long)(mid - left) * (right - mid);
                sum += count * nums[mid];
            }

            st.push(i);
        }

        return sum;
    }

    public long sumMin(int[] nums) {
        int n = nums.length;
        long sum = 0;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i <= n; i++) {
            while (!st.isEmpty() &&
                   (i == n || nums[st.peek()] > nums[i])) {

                int mid = st.pop();

                int left = st.isEmpty() ? -1 : st.peek();
                int right = i;

                long count = (long)(mid - left) * (right - mid);
                sum += count * nums[mid];
            }

            st.push(i);
        }

        return sum;
    }
}
