package org.blog.sort;

import org.blog.sort.strategies.SortStrategy;

import java.util.ArrayList;
import java.util.List;

public class SortContext{
    private final SortStrategy sortStrategy;

    public SortContext(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public List<Integer> sortNumbers(List<Integer> numbers) {
        List<Integer> copyOfList = new ArrayList<>(numbers);
        return sortStrategy.sort(copyOfList);
    }
}

