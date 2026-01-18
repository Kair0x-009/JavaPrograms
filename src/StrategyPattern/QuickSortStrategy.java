package StrategyPattern;

public class QuickSortStrategy implements SortingStrategy{
    @Override
    public void sort(int[] data) {
        System.out.println("Sorting using Quick Sort");
    }
}
