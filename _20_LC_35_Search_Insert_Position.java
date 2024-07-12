public class _20_LC_35_Search_Insert_Position {
    public static int searchInsert(int[] nums, int target) {
        int st = 0, e = nums.length - 1;
        int mid = 0;
        while (st <= e) {
            mid = st + (e - st) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                st = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return st;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 5, 6 };
        int target = 7; // 5 = op : 2 // 2 = op : 1 // 7 = op : 4

        System.out.println(searchInsert(nums, target)); // Output: 2
    }
}
