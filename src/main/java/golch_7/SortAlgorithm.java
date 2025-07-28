package golch_7;

public abstract class SortAlgorithm {

    public abstract int[] sort(int[] myArray);

    public void sortAndPrint(int[] myArray) {
        printArray(sort(myArray));
    }

    public void printArray(int[] myArray) {
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
