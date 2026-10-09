package strategy.problem03;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] original = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Input array: " + Arrays.toString(original));

        ArraySorter sorter = new ArraySorter(new BubbleSort());
        System.out.print("BubbleSort result:    ");
        sorter.sortAndPrint(original);

        sorter.setStrategy(new SelectionSort());
        System.out.print("SelectionSort result: ");
        sorter.sortAndPrint(original);

        sorter.setStrategy(new InsertionSort());
        System.out.print("InsertionSort result: ");
        sorter.sortAndPrint(original);

        System.out.println("Original untouched:   " + Arrays.toString(original));
    }
}
