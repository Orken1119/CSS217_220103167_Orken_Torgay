package strategy.problem14;

public class LinearSearchStrategy implements SearchStrategy {
    @Override
    public int search(int[] numbers, int target) {
        if (numbers == null) return -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
