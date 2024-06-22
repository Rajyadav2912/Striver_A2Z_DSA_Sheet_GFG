public class _02_GFG_Second_Largest {
    public static int print2largest(int arr[], int n) {
        int max = arr[0];
        int sec_max = -1;

        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                sec_max = max;
                max = arr[i];
            } else if (arr[i] < max && arr[i] > sec_max) {
                sec_max = arr[i];
            }
        }
        return sec_max;
    }

    public static void main(String[] args) {
        int N = 6;
        int Arr[] = { 12, 35, 1, 10, 34, 1 };

        System.out.println(print2largest(Arr, N));
        System.out.println("The largest element of the array is 35 and the second largest element is " + print2largest(
                Arr, N));
    }
}
