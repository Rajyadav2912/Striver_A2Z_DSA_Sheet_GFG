public class _12_LC_53_Kadane_Algo_max_Subarray_sum {
    public static int maxSubArray(int[] nums) {
        int Max = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currSum = currSum + nums[i];

            if (currSum < 0) {
                currSum = 0;
            }
            Max = Math.max(Max, currSum);
        }

        return Max;
    }

    public static void main(String[] args) {
        int nums[] = {-1 };

        System.out.println(maxSubArray(nums));
        // output = 6
    }
}
