
public class _01_GFG_Largest_Element_in_Array {
    public static int Largest(int arr[], int n) {
        int Largest_NO = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (Largest_NO < arr[i]) {
                Largest_NO = arr[i];
            }
        }
        return Largest_NO;
    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = { 1, 8, 7, 56, 90 };

        System.out.println(Largest(arr, n));
        // output = 90
    }

}