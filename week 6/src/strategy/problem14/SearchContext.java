package strategy.problem14;

public class SearchContext {
    private SearchStrategy strategy;

    public SearchContext(SearchStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(SearchStrategy strategy) {
        this.strategy = strategy;
    }

    public int search(int[] numbers, int target) {
        if (strategy == null) {
            return -1;
        }
        return strategy.search(numbers, target);
    }
}
