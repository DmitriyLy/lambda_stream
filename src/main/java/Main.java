import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("It works!");

        System.out.println("\n-------------------------------------------------------\n");

        createStream();
        collectors();

    }

    static void createStream() {

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        stream.forEach(System.out::println);

        System.out.println("");

        stream = Stream.of(new Integer[]{1, 2, 3, 4});
        stream.forEach(System.out::println);

        System.out.println("");

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            list.add(i);
        }

        list.stream().forEach(System.out::println);

        System.out.println("");

        Stream<Integer> randomNumbers = Stream.generate(() -> {
            int random = (new Random()).nextInt(100);
            System.out.println("New random " + random);
            return random;
        });

        randomNumbers.limit(20).forEach(System.out::println);

        System.out.println("");

        Stream<Integer> sequence = Stream.iterate(0, i -> {
            int result = i + 1;
            System.out.println("Iteration " + result);
            return result;
        });

        sequence.limit(5).forEach(System.out::println);

        System.out.println("");

        IntStream intStream = "12345_abcdefg".chars();
        intStream.forEach(System.out::println);

        System.out.println("");

        Stream<String> stringStream = Stream.of("A$B$C".split("\\$"));
        stringStream.forEach(System.out::println);

        System.out.println("\n-------------------------------------------------------\n");
    }

    static void collectors() {

    }

}
