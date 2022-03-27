package ro.go.bogdanenache;

import java.util.List;


/**
 * Print the largest sum between two numbers from a list
 * Eg. List.of(2, 1, 2, 3, 9, 8, 4, 5, 4, 8, 7);
 * should print 17
 */
public class LargestSumBetweenTwoNumbersInArray {

    public static void main(String[] args) {
        final List<Integer> integerList = List.of(2, 1, 2, 3, 9, 8, 4, 5, 4, 8, 7);
        final Integer integer = findLargestSumBetweenTwoNumbersInList(integerList);
        System.out.println(integer);
    }

    public static Integer findLargestSumBetweenTwoNumbersInList(List<Integer> integerList) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
