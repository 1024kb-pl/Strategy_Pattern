package org.blog;

import org.blog.sort.SortContext;
import org.blog.sort.SortFacade;
import org.blog.sort.strategies.BubbleSortStrategy;
import org.blog.sort.strategies.MergeSortStrategy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        SortContext bubbleSortContext = new SortContext(new BubbleSortStrategy());
        SortContext mergeSortContext = new SortContext(new MergeSortStrategy());

        System.out.println(bubbleSortContext);
    }
}
