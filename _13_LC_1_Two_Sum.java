public class _13_LC_1_Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        int N = nums.length;
        int arr[] = new int[2];
        arr[0] = arr[1] = -1;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int num[] = { 2, 7, 11, 15 };
        int target = 9;

        int ans[] = twoSum(num, target);
        System.out.println("[" + ans[0] + "," + ans[1] + "]");
        System.out.println(target);
        // output = [0, 1]

    }
}
