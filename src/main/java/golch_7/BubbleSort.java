package golch_7;

public class BubbleSort {

    public int[] myArray;
    private int n;

    public int[] sort(int[] testArray) {
        myArray = testArray;
        n = myArray.length;
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

    public void sortAndPrint(int[] myArray) {
        printArray(sort(myArray));
    }

    private void printArray(int[] myArray) {
        StringBuilder arrayToPrint = new StringBuilder();
        arrayToPrint.append("[");
        for (int n : myArray) {
            arrayToPrint.append(n + ", ");
        }
        arrayToPrint.setLength(arrayToPrint.length() - 2);
        arrayToPrint.append("]");

        System.out.println(arrayToPrint.toString());
    }
}
