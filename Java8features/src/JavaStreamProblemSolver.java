import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaStreamProblemSolver {
    static List<Integer> integerList = Arrays.asList(1, 3, 2, 5, 4, 6, 7, 8, 11, 10, 15, 14, 13);
    static List<Integer> integerDPList = Arrays.asList(1, 3, 2, 5, 4, 6, 7, 8, 2, 4, 1);
    static String sampleString1 = "Quick brown fox jump dump over the lazy dog and cat";

    public static void main(String[] args) {
        //print even numbers in the integer list
        printQuestion("print even numbers in the integer list");
        integerList.stream().filter(e -> e % 2 == 0).forEach(System.out::println);

        //find integer starting with 1
        printQuestion("find integer starting with 1");
        integerList.stream().map(e -> e + "").filter(e -> e.startsWith("1")).forEach(System.out::println);

        //filter integers duplicate in list
        printQuestion("filter integers duplicate in list");
        Set<Integer> filterDpLst = new HashSet<>();
        integerDPList.stream().filter(e -> !filterDpLst.add(e)).forEach(System.out::println);

        //find the first element of the list using Stream functions
        printQuestion("find the first element of the list using Stream functions");
        integerList.stream().findFirst().ifPresent(System.out::println);

        //find the total number of elements present in the list using Stream functions
        printQuestion("find the total number of elements present in the list using Stream functions");
        System.out.println(integerList.stream().count());

        //find the maximum value element present in it using Stream functions
        printQuestion("find the maximum value element present in it using Stream functions");
        integerDPList.stream().max(Integer::compare).ifPresent(System.out::println);

        //find the first non-repeated character in it using Stream functions
        printQuestion("find the first non-repeated character in it using Stream functions");
        Map<Character, Long> resultSampleString1 = sampleString1.chars().mapToObj(e -> Character.toLowerCase(Character.valueOf((char) e))).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        resultSampleString1.entrySet().stream().filter(e -> e.getValue() > 1l).map(e -> e.getKey()).findFirst().ifPresent(System.out::println);

        //sort all the values present in it using Stream functions
        printQuestion("sort all the values present in it using Stream functions");
        integerList.stream().sorted().forEach(System.out::println);

        //sort all the values present in it in descending order using Stream functions
        printQuestion("sort all the values present in it in descending order using Stream functions");
        integerList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);


    }


    private static void printQuestion(String q) {
        System.out.println(q);
    }
}
