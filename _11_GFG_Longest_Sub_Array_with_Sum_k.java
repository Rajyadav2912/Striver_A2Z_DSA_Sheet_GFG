public class _11_GFG_Longest_Sub_Array_with_Sum_k {

    // Function for finding maximum and value pair
    public static int lenOfLongSubarr(int A[], int N, int K) {
        // Complete the function
        int len = 0;
        for (int i = 0; i < N; i++) { // starting index
            for (int j = i; j < N; j++) { // ending index

                int s = 0;
                for (int k = i; k <= j; k++) {
                    s = s + A[k];
                }

                if (s == K)
                    len = Math.max(len, j - i + 1);
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int nums[] = { -1, -2, 6, 4, 5, 3 };
        int k = 15;
        System.out.println(lenOfLongSubarr(nums, nums.length, k));
    }
}
