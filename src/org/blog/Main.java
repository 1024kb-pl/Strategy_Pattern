package org.blog;

import org.blog.sort.SortContext;
import org.blog.sort.strategies.BubbleSortStrategy;
import org.blog.sort.strategies.MergeSortStrategy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        SortContext bubbleSortContext = new SortContext(new BubbleSortStrategy());
        SortContext mergeSortContext = new SortContext(new MergeSortStrategy());

        List<Integer> numbers = new LinkedList<>(Arrays.asList(1, -1, -120, 3, 4, 9, 10, 12, 9, 5, -3));

        System.out.println(bubbleSortContext.sortNumbers(numbers));
        System.out.println(mergeSortContext.sortNumbers(numbers));
    }
}
