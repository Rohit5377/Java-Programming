
// Insertion sort used when the array is partially sorted
class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 5, 4, 3};
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j >= 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
