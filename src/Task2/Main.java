package Task2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many words you want to use:");
        int wordsCount = scan.nextInt();
        scan.nextLine();

        String[] wordsArray = new String[wordsCount];
        for(int i = 0; i < wordsCount; i++) {
            String word = scan.nextLine();
            wordsArray[i] = word;
        }

        int counter = 0;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < wordsArray.length - 1; i++) {
                int upperCaseCount1 = countUpperCaseLetters(wordsArray[i]);
                int upperCaseCount2 = countUpperCaseLetters(wordsArray[i + 1]);

                if (upperCaseCount1 < upperCaseCount2) {
                    String temp = wordsArray[i];
                    wordsArray[i] = wordsArray[i + 1];
                    wordsArray[i + 1] = temp;
                    counter++; // Increment counter for each swap
                    swapped = true;
                }
            }
        } while (swapped);

        System.out.println("Sorted words:");
        for (String word : wordsArray) {
            System.out.println(word);
        }
    }

    private static int countUpperCaseLetters(String word) {
        int count = 0;
        for (char ch : word.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                count++;
            }
        }
        return count;
    }
}
