import java.util.*;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String commands = scanner.nextLine();

        while (!commands.equals("end")) {

            String[] command = commands.split(" ");

            if (command[0].equals("Contains")) {
                int searchedNumber = Integer.parseInt(command[1]);
                    if (numbers.contains(searchedNumber)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
            }

            if (command[0].equals("Print")) {

                switch (command[1]) {
                    case "even":
                        for (int evenNumber : numbers) {
                            if (evenNumber % 2 == 0) {
                                System.out.print(evenNumber + " ");
                            }
                        }
                        break;
                    case "odd":
                        for (int oddNumber : numbers) {
                            if (oddNumber % 2 != 0) {
                                System.out.print(oddNumber + " ");
                            }
                        }
                        break;
                }

                System.out.println();
            }

            if (command[0].equals("Get") && command[1].equals("sum")) {
                int sum = 0;
                for (int number : numbers) {
                    sum += number;
                }
                System.out.println(sum);
            }

            if (command[0].equals("Filter")) {

                switch (command[1]) {
                    case "<":
                        for (int i = 0; i < numbers.size(); i++) {
                            if (Integer.parseInt(command[2]) > numbers.get(i)) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        break;
                    case ">":
                        for (int i = 0; i < numbers.size(); i++) {
                            if (Integer.parseInt(command[2]) < numbers.get(i)) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        break;
                    case "<=":
                        for (int i = 0; i < numbers.size(); i++) {
                            if (Integer.parseInt(command[2]) >= numbers.get(i)) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        break;
                    case ">=":
                        for (int i = 0; i < numbers.size(); i++) {
                            if (Integer.parseInt(command[2]) <= numbers.get(i)) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        break;
                }

                System.out.println();
            }

            commands = scanner.nextLine();
        }
    }
}