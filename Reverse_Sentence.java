package DSA.first;
import  java.util.Scanner;
public class Reverse_Sentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String inputSentence = scanner.nextLine();

        String reversedSentence = reverseSentence(inputSentence);

        System.out.println("Reversed : " + reversedSentence);

        scanner.close();
    }

    public static String reverseSentence(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }


        if (reversed.length() > 0) {
            reversed.deleteCharAt(reversed.length() - 1);
        }

        return reversed.toString();
    }
}
