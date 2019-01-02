package org.blog.sort.strategies;

import org.blog.sort.SortStrategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSortStrategy implements SortStrategy {
    @Override
    public List<Integer> sort(List<Integer> listNumbers) {
        System.out.println("Bubble sort...");
        int n = listNumbers.size();

        Integer [] numbers = new Integer[n];
        listNumbers.toArray(numbers);

        int temp = 0;

        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(numbers[j-1] > numbers[j]){
                    temp = numbers[j-1];
                    numbers[j-1] = numbers[j];
                    numbers[j] = temp;
                }

            }
        }


        return Arrays.asList(numbers);
    }
}
