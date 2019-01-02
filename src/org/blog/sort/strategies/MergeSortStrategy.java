package org.blog.sort.strategies;

import org.blog.sort.SortStrategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeSortStrategy implements SortStrategy {

    @Override
    public List<Integer> sort(List<Integer> numbers) {
        System.out.println("Merge sort...");
        Collections.sort(numbers);
        return numbers;
    }
}
