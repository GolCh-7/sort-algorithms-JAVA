package golch_7;

public class BubbleSort extends SortAlgorithm{

    public int[] sort(int[] myArray) {
        int n = myArray.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n-i-1); j++) {
                if (myArray[j] > myArray[j+1]) {
                        int a = myArray[j];
                        myArray[j] = myArray[j+1];
                        myArray[j+1] = a;
                }
            }
        };

        return myArray;
    }
}
