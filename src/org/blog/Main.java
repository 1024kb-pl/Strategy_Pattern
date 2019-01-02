package org.blog;

import org.blog.sort.SortFacade;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        SortFacade sortFacade = new SortFacade();

        List<Integer> numbers = new LinkedList<>(Arrays.asList(1, -1, -120, 3, 4, 9, 10, 12, 9, 5, -3));

        System.out.println(sortFacade.sortByBubbleSort(numbers));
        System.out.println(sortFacade.sortByMergeSort(numbers));
    }
}
