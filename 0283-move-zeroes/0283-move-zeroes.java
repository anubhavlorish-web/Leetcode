class Solution {
    public void moveZeroes(int[] nums) {
        int nextNonZero = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nextNonZero++] = nums[i];
            }
        }

        while (nextNonZero < nums.length) {
            nums[nextNonZero++] = 0;
        }
    }
}
