package ro.go.bogdanenache;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static ro.go.bogdanenache.LargestSumBetweenTwoNumbersInArray.findLargestSumBetweenTwoNumbersInList;

class LargestSumBetweenTwoNumbersInArrayTest {

    @Test
    @DisplayName("Test implementation with the same list as in code")
    void findLargestSumBetweenTwoNumbersInListFIrstTest() {
        final List<Integer> integerList = List.of(2, 1, 2, 3, 9, 8, 4, 5, 4, 8, 7);
        final Integer integer = findLargestSumBetweenTwoNumbersInList(integerList);
        assertNotNull(integer);
        assertEquals(17, integer);
    }


    @Test
    @DisplayName("Test it does not throw any exceptions")
    void findLargestSumBetweenTwoNumbersInListSecondTest() {
        final List<Integer> integerList = List.of();
        assertDoesNotThrow(() -> findLargestSumBetweenTwoNumbersInList(integerList));
    }

    @Test
    @DisplayName("Test it does throw an exceptions if margins are taken into consideration")
    void findLargestSumBetweenTwoNumbersInListForthTest() {
        final List<Integer> integerList = List.of(3,5);
        assertThrows(RuntimeException.class, () -> findLargestSumBetweenTwoNumbersInList(integerList));
    }


    @Test
    @DisplayName("Test implementation with different list")
    void findLargestSumBetweenTwoNumbersInListThirdTest() {
        final List<Integer> integerList = List.of(2, 1, 2, 3, 9, 8, 4, 5, 4, 8, 7, 9, 1, 4, 30, 4);
        final Integer integer = findLargestSumBetweenTwoNumbersInList(integerList);
        assertNotNull(integer);
        assertNotEquals(17, integer);
        assertEquals(39, integer);
    }
}