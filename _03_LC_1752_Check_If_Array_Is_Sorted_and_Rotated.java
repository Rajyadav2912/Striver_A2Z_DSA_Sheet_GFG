public class _03_LC_1752_Check_If_Array_Is_Sorted_and_Rotated {
    public static boolean check(int[] nums) {
        int ans = 0, size = nums.length;
        if (nums[0] < nums[size - 1]) {
            ans++;
        }
        for (int i = 1; i < size; i++) {
            if (nums[i - 1] > nums[i]) {
                ans++;
                if (ans > 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 }; // ANS : True Because arrays is sorrted
        // int arr[] = { 3, 4, 2, 5, 6 }; // Ans : False Because arrays is not sorrted
        System.out.println(check(arr));
    }
}
