package MapDemo;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        String[] colors = {"red", "white", "blue", "green", "gray",
                 "orange", "tan", "white", "cyan", "peach", "gray", "orange"};
        List<String> list = Arrays.asList(colors);
        System.out.println("List: " + list);
        printNonDuplicates(list);
    }
//    Figure 16.16 uses a HashSet to remove duplicate strings from a List. Recall that both
//    List and Collection are generic types, so line 16 creates a List that contains String
//    objects, and line 20 passes a Collection of Strings to method printNonDuplicates.
//    Method printNonDuplicates (lines 24–35) takes a Collection argument. Line 27 constructs
//    a HashSet<String> from the Collection<String> argument. By definition, Sets
//do not contain duplicates, so when the HashSet is constructed, it removes any duplicates in
//    the Collection. Lines 31–32 output elements in the Set.

    private static void printNonDuplicates(Collection<String> values){
        Set<String> set = new HashSet<>(values);
        System.out.printf("%nNon-duplicates are: ");

        for (String value: set){
            System.out.printf("%10s",value);

        }
    }
}
