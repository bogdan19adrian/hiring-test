package ro.go.bogdanenache;

import java.util.List;

/**
 * Find the first name in the list that does not repeat itself
 * Eg. List.of("John", "Mary", "Anne", "John", "Anne") should return Marry
 *
 */
public class FindFirstUnrepeatedName {

    public static void main(String[] args) {
       final List<String> listOfNames = List.of("John", "Mary", "Anne", "John", "Anne", "George", "Victoria", "Victoria");
        System.out.println(findFirstUnrepeatedName(listOfNames));
    }

    public static String findFirstUnrepeatedName(List<String> listOfNames) {

        throw new UnsupportedOperationException("Not yet implemented");
    }

}
