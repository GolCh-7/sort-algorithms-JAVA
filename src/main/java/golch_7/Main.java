package golch_7;

public class Main {

    public static int[] testArray = {64, 34, 25, 12, 22, 11, 90, 5};

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();
        InsertionSort insertionSort = new InsertionSort();

        bubbleSort.sortAndPrint(testArray);
        resetTestArray();
        selectionSort.sortAndPrint(testArray);
        resetTestArray();
        insertionSort.sortAndPrint(testArray);
        resetTestArray();

    }

    public static void resetTestArray() {
        testArray = new int[]{64, 34, 25, 12, 22, 11, 90, 5};
    }

}
