package StrategyPattern;

public class MergeSortStrategy implements SortingStrategy{
    @Override
    public void sort(int[] data) {
        System.out.println("Sorting using merge sort");
    }
}
