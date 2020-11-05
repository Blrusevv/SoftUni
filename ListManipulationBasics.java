import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String commands = scanner.nextLine();

        while (!commands.equals("end")) {

            String[] command = commands.split(" ");

            switch (command[0]) {
                case "Add":
                    int numberToAdd = Integer.parseInt(command[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Remove":
                    Integer numberToRemove = Integer.parseInt(command[1]);
                    numbers.remove(numberToRemove);
                    break;
                case "RemoveAt":
                    int indexToRemove = Integer.parseInt(command[1]);
                    numbers.remove(indexToRemove);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(command[2]);
                    int indexToInsertAt = Integer.parseInt(command[1]);
                    numbers.add(numberToInsert, indexToInsertAt);
                    break;
            }

            commands = scanner.nextLine();
        }

        for (int number : numbers) {
                System.out.print(number + " ");
        }
    }
}
