package ro.go.bogdanenache;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static ro.go.bogdanenache.CountLetterApparitionInString.countLetterApparitionInString;

class CountLetterApparitionInStringTest {

    private static final String input = "abracadabra";
    private static final char character = 'a';

    @Test
    @DisplayName("Test that no exception is thrown")
    void countLetterApparitionInStringFirstTest() {
        assertDoesNotThrow(() -> countLetterApparitionInString(character, input));
    }

    @Test
    @DisplayName("Test that the count works correctly")
    void countLetterApparitionInStringSecondTest() {
        final int apparitions = countLetterApparitionInString(character, input);
        assertEquals(5, apparitions);
    }

    @Test
    @DisplayName("Test that the count works correctly")
    void countLetterApparitionInStringThirdTest() {
        final int apparitions = countLetterApparitionInString(character, input);
        assertNotEquals(6, apparitions);
    }



}