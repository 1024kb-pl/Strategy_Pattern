package org.blog.sort;

import org.blog.sort.strategies.BubbleSortStrategy;
import org.blog.sort.strategies.MergeSortStrategy;

import java.util.List;

public class SortFacade {
    public List<Integer> sortByBubbleSort(List<Integer> numbers) {
        SortContext sortContext = new SortContext(new BubbleSortStrategy());
        return sortContext.sortNumbers(numbers);
    }

    public List<Integer> sortByMergeSort(List<Integer> numbers) {
        SortContext sortContext = new SortContext(new MergeSortStrategy());
        return sortContext.sortNumbers(numbers);
    }
}
