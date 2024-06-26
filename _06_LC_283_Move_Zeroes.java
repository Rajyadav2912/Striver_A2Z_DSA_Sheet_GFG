public class _06_LC_283_Move_Zeroes {
    public static void moveZeroes(int[] nums) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 0, 1, 0, 2, 3, 4 };
        moveZeroes(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        // int num[] = { 0, 1 };

        // if (num[1] != 0) {
        // System.out.print("True");
        // } else {
        // System.out.print("False");
        // }

    }
}