import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        numbers.removeIf(number -> number < 0);
        Collections.reverse(numbers);

        if (numbers.size() == 0) {
            System.out.println("empty");
        } else {
            System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
