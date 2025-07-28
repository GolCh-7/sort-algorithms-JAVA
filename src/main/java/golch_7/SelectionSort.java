package golch_7;

public class SelectionSort extends SortAlgorithm {


    @Override
    public int[] sort(int[] myArray) {
        int n = myArray.length;

        for (int i = 0; i < n-1; i++) { // start each iteration in order from left to right of array
            int lowestIndex = i;
            for (int j = i+1; j < n-i; j++) { // start comparisons from value to the right of start value
                if (myArray[j] < myArray[lowestIndex]) {
                    lowestIndex = j;
                }
            }
            // swap the start of unsorted array with the lowest value found
            int tempVal = myArray[lowestIndex];
            myArray[lowestIndex] = myArray[i];
            myArray[i] = tempVal;
        }

        return myArray;
    }
}
