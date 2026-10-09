package strategy.problem03;

import java.util.Arrays;

public class ArraySorter {
    private SortStrategy strategy;

    public ArraySorter(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public int[] sort(int[] input) {
        if (input == null) return new int[0];
        int[] copy = input.clone();
        if (strategy != null) {
            strategy.sort(copy);
        }
        return copy;
    }

    public void sortAndPrint(int[] input) {
        int[] sorted = sort(input);
        System.out.println(Arrays.toString(sorted));
    }
}
