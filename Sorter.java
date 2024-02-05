public class Sorter<T extends Comparable<T>> {
    public void selectionSort(T[] array) {

        // Traverse through all array elements
        for (int i = 0; i < array.length - 1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            T temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public void sort(T[] array) {
        selectionSort(array);
    }

}
