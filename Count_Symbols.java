package DSA.first;
import  java.util.Scanner;
public class Count_Symbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of text:");
        String line = scanner.nextLine();

        int symbolCount = countSymbols(line);

        System.out.println("Number of symbols: " + symbolCount);

        scanner.close();
    }

    public static int countSymbols(String text) {
        int symbolCount = 0;

        for (char character : text.toCharArray()) {
            if (!Character.isLetterOrDigit(character) && !Character.isWhitespace(character)) {
                symbolCount++;
            }
        }

        return symbolCount;
    }
}
