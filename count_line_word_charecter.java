package DSA.first;
import java.util.Scanner;
public class count_line_word_charecter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your paragraph (press Enter twice to finish):");

        StringBuilder paragraph = new StringBuilder();
        String line;

        while (true) {
            line = scanner.nextLine();

            if (line.isEmpty()) {
                break;
            }

            paragraph.append(line).append("\n");
        }

        int characterCount = paragraph.length();
        int wordCount = countWords(paragraph.toString());
        int lineCount = paragraph.toString().split("\n").length;

        System.out.println();
        System.out.println("Character count: " + characterCount);
        System.out.println("Word count: " + wordCount);
        System.out.println("Line count: " + lineCount);

        scanner.close();
    }

    public static int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }
}
