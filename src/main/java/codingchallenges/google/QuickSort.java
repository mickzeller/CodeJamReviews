package codingchallenges.google;

public class QuickSort {

    public static void main(String[] args) {
        int array[] = {10, 7, 8, 9, 1, 5, 13, 90};
        for (int i = 0; i < array.length - 1; i++) {
            System.out.println(array[i]);
        }
        System.out.println("===============");
        int n = array.length;
        sorts(array);

        for (int i = 0; i < array.length - 1; i++) {
            System.out.println(array[i]);
        }
    }

    public static void sort(int[] array, int low, int high) {
        if (low < high) {
            int partitioningIndex = pivot(array, low, high);
            pivot(array, low, partitioningIndex - 1);
            pivot(array, partitioningIndex + 1, high);
        }
    }

    public static int pivot(int[] array, int low, int high) {

        int pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public static int[] sorts(int[] data) {
        return quickSort(data, 0, (data.length - 1));
    }

    private static int[] quickSort(int[] data, int firstIndex, int lastIndex) {

        if (firstIndex < lastIndex) {
            int partitionIndex = pivot(data, firstIndex, lastIndex);
            quickSort(data, firstIndex, partitionIndex - 1);
            quickSort(data, partitionIndex + 1, lastIndex);
        }
        return data;
    }
}
