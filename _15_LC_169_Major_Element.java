public class _15_LC_169_Major_Element {
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int el = 0;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count = 1;
                el = nums[i];
            } else if (nums[i] == el) {
                count++;
            } else {
                count--;
            }
        }

        int count1 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == el) {
                count1++;
            }
        }
        if (count1 > (n / 2)) {
            return el;
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 3 };
        System.out.println(majorityElement(nums));
    }
}
