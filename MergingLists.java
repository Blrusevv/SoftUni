import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstNumbers = scanner.nextLine();
        String secondNumbers = scanner.nextLine();

        List<Integer> firstList = getNumbersToList(firstNumbers);
        List<Integer> secondList = getNumbersToList(secondNumbers);

        List<Integer> mergeList = new ArrayList<>();


        int firstListNumbers = 0;
        int secondListNumbers = 0;

        while (firstListNumbers < firstList.size() || secondListNumbers < secondList.size()) {

            if (firstListNumbers < firstList.size()) {
                mergeList.add(firstList.get(firstListNumbers));
            }

            if (secondListNumbers < secondList.size()) {
                mergeList.add(secondList.get(secondListNumbers));
            }


            firstListNumbers++;
            secondListNumbers++;
        }

        for (int numbers : mergeList) {
            System.out.print(numbers + " ");
        }


    }
     public static List<Integer> getNumbersToList(String data) {
        String[] input = data.split(" ");
        List<Integer> currentList = new ArrayList<>();
        for (String s : input) {
            currentList.add(Integer.parseInt(s));
        }
        return currentList;
    }
}
