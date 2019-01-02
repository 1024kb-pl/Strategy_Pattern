package org.blog.sort;

import java.util.ArrayList;
import java.util.List;

class SortContext{
    private final SortStrategy sortStrategy;

    SortContext(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    List<Integer> sortNumbers(List<Integer> numbers) {
        List<Integer> copyOfList = new ArrayList<>(numbers);
        return sortStrategy.sort(copyOfList);
    }
}

