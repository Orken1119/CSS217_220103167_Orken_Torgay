package strategy.problem14;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] data = {7, 14, 21, 28, 35, 42, 49, 56, 63};
        int target = 42;
        int missingTarget = 99;

        System.out.println("Dataset: " + Arrays.toString(data));
        System.out.println("Searching for target: " + target);

        SearchContext context = new SearchContext(new LinearSearchStrategy());
        int linearIdx = context.search(data, target);
        System.out.println("Linear Search found " + target + " at index: " + linearIdx);

        context.setStrategy(new BinarySearchStrategy());
        int binaryIdx = context.search(data, target);
        System.out.println("Binary Search found " + target + " at index: " + binaryIdx);

        int missingIdx = context.search(data, missingTarget);
        System.out.println("Binary Search for " + missingTarget + " returned: " + missingIdx);
    }
}
