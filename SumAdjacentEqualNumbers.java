import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] numbersArray = scanner.nextLine().split(" ");
        List<Double> numbers = new ArrayList<>();

        for (String s : numbersArray) {
            numbers.add(Double.parseDouble(s));
        }

        int i = 0;
        while (i < numbers.size() - 1){
            if (numbers.get(i).equals(numbers.get(i + 1))) {
                numbers.set(i, numbers.get(i) + numbers.get(i + 1));
                numbers.remove(i + 1);
                i = 0;
            } else {
                i++;
            }
        }

        for (double number : numbers) {
            System.out.print(new DecimalFormat("0.##").format(number) + " ");
        }
    }

}
