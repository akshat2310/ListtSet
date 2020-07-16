import java.util.*;

public class ListtSet {
    public static void main(String[] args)
    {

        // Creating a list of strings
        List<String> aList = Arrays.asList("Akshat", "for",
                "Dave", "Assigment", "dfdd");

        // Creating a hash set using constructor
        Set<String> hSet = new HashSet<String>(aList);

        System.out.println("Created HashSet is");
        for (String x : hSet)
            System.out.println(x);

        System.out.println("Created TreeSet is");
        Set<String> tSet = new TreeSet<String>(aList);
        System.out.println("Created TreeSet is");
        for (String x : tSet)
            System.out.println(x);
    }
}
