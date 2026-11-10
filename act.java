
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class act {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println(" REGULAR EXPRESSION VALIDATION");
        System.out.println("==================================");

        System.out.print("\nEnter a string (digits only): ");
        String digits = sc.nextLine();

        System.out.println("Result: " +
            Pattern.matches("[0-9]+", digits));

        System.out.print("\nEnter a string (letters only): ");
        String letters = sc.nextLine();

        System.out.println("Result: " +
            letters.matches("[a-zA-Z]+"));

        System.out.print("\nEnter a string (letters and numbers): ");
        String alphaNumeric = sc.nextLine();

        System.out.println("Result: " +
            alphaNumeric.matches("[a-zA-Z0-9]+"));

        System.out.print("\nEnter a string (starts with Java): ");
        String startsWith = sc.nextLine();

        System.out.println("Result: " +
            startsWith.matches("^Java.*"));

        System.out.print("\nEnter a string (ends with .com): ");
        String endsWith = sc.nextLine();

        System.out.println("Result: " +
            endsWith.matches(".*\\.com$"));

        System.out.print("\nEnter a string (exactly 5 digits): ");
        String fiveDigits = sc.nextLine();

        System.out.println("Result: " +
            Pattern.matches("[0-9]{5}", fiveDigits));

        System.out.print("\nEnter a string (at least 8 characters): ");
        String minimumLength = sc.nextLine();

        System.out.println("Result: " +
            minimumLength.matches(".{8,}"));

        System.out.print("\nEnter a string (with whitespace): ");
        String whitespace = sc.nextLine();

        Pattern pattern = Pattern.compile("\\s");
        Matcher matcher = pattern.matcher(whitespace);

        System.out.println("Result: " + matcher.find());

        System.out.println("\n==================================");
        System.out.println("       VALIDATION COMPLETE");
        System.out.println("==================================");

        sc.close();
    }
}
