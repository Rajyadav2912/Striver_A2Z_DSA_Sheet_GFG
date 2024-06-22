public class _04_LC_26_Remove_Duplicates_from_Sorted_Array {
    public static int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[k] != nums[i]) {
                k = k + 1;
                // nums[k] = nums[i];
            }
        }
        return k + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 4 };
        System.out.println(removeDuplicates(arr));
    }
}
