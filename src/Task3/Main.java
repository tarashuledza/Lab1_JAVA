package Task3;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // User-input code
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email address");
        String email = scan.next();
        if(validateEmail(email)) {
            System.out.println("Email is Valid");
        } else {
            System.out.println("Email invalid");
        }

    }

    public static boolean validateEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        char firstChar = email.charAt(0);
        char lastChar = email.charAt(email.length() - 1);

        if (!Character.isLetter(firstChar) || !Character.isLetterOrDigit(lastChar)) {
            return false;
        }

        for (int i = 0; i < email.length() - 1; i++) {
            char currentChar = email.charAt(i);
            char nextChar = email.charAt(i + 1);

            if (!Character.isLetterOrDigit(currentChar) && !Character.isLetterOrDigit(nextChar)) {
                return false;
            }
        }

        int atIndex = email.indexOf('@');
        int dotIndex = email.indexOf('.', atIndex);
        if (dotIndex < 0 || dotIndex - atIndex < 2 || email.lastIndexOf('.') != dotIndex) {
            return false;
        }

        for (int i = 0; i < email.length(); i++) {
            char currentChar = email.charAt(i);
            if (currentChar != '@' && currentChar != '.' && !Character.isLetterOrDigit(currentChar)) {
                return false;
            }
        }

        return true;
    }
}
