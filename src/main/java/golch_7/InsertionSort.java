package golch_7;

/*
How it works:
1. Take first value from unsorted part of array
2. Move the value to the correct place in the sorted part of the array
3. Go through the unsorted part of the array as many times as there are values
*/
public class InsertionSort extends SortAlgorithm {

    @Override
    public int[] sort(int[] myArray) {
        // determine the length of the array
        int n = myArray.length;
        // loop through the array, omitting the first element
        for (int i = 1; i < n; i++) {
            // identify the value of the currently observed element
            int key = myArray[i];
            // set the index to the one before currently pointed one
            int j = i-1;
            // any values greater than that of the key is shifted ahead by one position
            while (j >= 0 && myArray[j] > key) {
                myArray[j+1] = myArray[j];
                j = j-1;
            }
            // the key is set to it correct position
            myArray[j+1] = key;
        }
        return myArray;
    }
    
}
