package ro.go.bogdanenache;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static ro.go.bogdanenache.FindFirstUnrepeatedName.findFirstUnrepeatedName;

class FindFirstUnrepeatedNameTest {


    @Test
    @DisplayName("Test implementation using the same list as in code")
    void findFirstUnrepeatedNameFirstTest() {
        final List<String> listOfNames = List.of("John", "Mary", "Anne", "John", "Anne", "George", "Victoria", "Victoria");
        final String name = findFirstUnrepeatedName(listOfNames);
        assertNotNull(name);
        assertEquals("Mary", name);

    }

    @Test
    @DisplayName("Test implementation using different list")
    void findFirstUnrepeatedNameSecondTest() {

        final List<String> listOfNames = List.of("John", "Mary", "Anne", "John", "Anne", "John", "Anne", "Christine", "Christine",
                "Emma", "Marry", "Stan", "Peppa", "George", "Alina", "Alina", "Alexandra"
        );
        final String name = findFirstUnrepeatedName(listOfNames);
        assertNotNull(name);
        assertEquals("Emma", name);
    }

    @Test
    @DisplayName("Test implementation using a small list")
    void findFirstUnrepeatedNameThirdTest() {

        final List<String> listOfNames = List.of("John", "Mary");
        final String name = findFirstUnrepeatedName(listOfNames);
        assertNotNull(name);
        assertEquals("John", name);
    }

    @Test
    @DisplayName("Test that the method does not throw any exceptions")
    void findFirstUnrepeatedNameForthTest() {

        final List<String> listOfNames = List.of();
        assertDoesNotThrow(() -> findFirstUnrepeatedName(listOfNames));
    }
}