import java.util.ArrayList;

public class _19_LC_2149_Rearrange_Array_Elements_by_Sign {
    public static int[] RearrangeArray(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int pos = 0, neg = 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                ans[pos] = nums[i];
                pos += 2;
            } else {
                ans[neg] = nums[i];
                neg += 2;
            }
        }
        return ans;
    }

    // Time Complexity = O(N)
    // Space Complexity = O(N)
    public static int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> Pos = new ArrayList<>();
        ArrayList<Integer> Neg = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0)
                Pos.add(nums[i]);
            else
                Neg.add(nums[i]);
        }

        for (int i = 0; i < Pos.size(); i++) {
            nums[2 * i] = Pos.get(i);
            nums[2 * i + 1] = Neg.get(i);
        }
        return nums;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 1, -2, -5, 2, 4 };

        RearrangeArray(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }
    }
}
