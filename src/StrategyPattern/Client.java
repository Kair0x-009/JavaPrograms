package StrategyPattern;

public class Client {
    public static void main(String[] arr){
        int[] data = {12,23,56,85,20};
        SortingContext sortCtx = new SortingContext(new BubbleSortStrategy());
        sortCtx.performSort(data);

        sortCtx.setSortingStrategy(new QuickSortStrategy());
        sortCtx.performSort(data);

        sortCtx.setSortingStrategy(new MergeSortStrategy());
        sortCtx.performSort(data);
    }
}
