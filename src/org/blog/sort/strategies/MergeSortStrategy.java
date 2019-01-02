package org.blog.sort.strategies;

import java.util.Collections;
import java.util.List;

public class MergeSortStrategy implements SortStrategy {

    @Override
    public List<Integer> sort(List<Integer> numbers) {
        System.out.println("Merge sort...");
        Collections.sort(numbers);
        return numbers;
    }
}
