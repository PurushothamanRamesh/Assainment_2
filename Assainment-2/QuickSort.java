public class QuickSort {
    static void swapTheElements(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swapTheElements(arr, i, j);
            }
        }
        swapTheElements(arr, i + 1, high);
        return (i + 1);
    }
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    static void printArray(int[] arr, int len) {
        for (int i = 0; i < len; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        quickSort(arr, 0, arr.length-1);
        printArray(arr, arr.length);
    }
}