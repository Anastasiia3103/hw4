public class Rec2 {
    public boolean splitOdd10(int[] nums) {
        return splitHelper(0, nums, 0, 0);
    }

    private boolean splitHelper(int start, int[] nums, int sum1, int sum2) {
        if (start >= nums.length) {
            return (sum1 % 10 == 0 && sum2 % 2 == 1) || (sum1 % 2 == 1 && sum2 % 10 == 0);
        }
        return splitHelper(start + 1, nums, sum1 + nums[start], sum2) ||
                splitHelper(start + 1, nums, sum1, sum2 + nums[start]);
    }
    public boolean groupSum6(int start, int[] nums, int target) {
        // Base case: if there are no more elements to consider, return whether target is zero or not.
        if (start == nums.length) {
            return target == 0;
        }

        // If the current element is 6, we must choose it, so subtract 6 from the target.
        if (nums[start] == 6) {
            return groupSum6(start + 1, nums, target - 6);
        }

        // Try two possibilities: either include the current element in the sum, or exclude it.
        // If either possibility works, return true.
        return groupSum6(start + 1, nums, target - nums[start]) || groupSum6(start + 1, nums, target);
    }
    public boolean groupSum5(int start, int[] nums, int target) {
        // If we have reached the end of the array, check if the target is 0.
        if (start >= nums.length) {
            return (target == 0);
        }

        // If the current number is a multiple of 5, include it in the sum and move to the next number.
        if (nums[start] % 5 == 0) {
            return groupSum5(start + 1, nums, target - nums[start]);
        }

        // If the number following a multiple of 5 is 1, skip it and move to the next number.
        if (start > 0 && nums[start - 1] % 5 == 0 && nums[start] == 1) {
            return groupSum5(start + 1, nums, target);
        }

        // Include the current number in the sum and move to the next number.
        return groupSum5(start + 1, nums, target - nums[start]) || groupSum5(start + 1, nums, target);
    }
}
