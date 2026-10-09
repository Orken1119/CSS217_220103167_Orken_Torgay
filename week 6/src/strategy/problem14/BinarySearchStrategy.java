package strategy.problem14;

public class BinarySearchStrategy implements SearchStrategy {
    @Override
    public int search(int[] numbers, int target) {
        if (numbers == null) return -1;
        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (numbers[mid] == target) {
                return mid;
            } else if (numbers[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
