package DSA.first;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        String input = "hello, world!";
        String capitalized = capitalizeFirstLetter(input);

        System.out.println("Original String: " +input);
        System.out.println("Capitalized String: " +capitalized);
    }

    public static String capitalizeFirstLetter(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        char[] chars = input.toCharArray();
        if (Character.isLowerCase(chars[0])) {
            chars[0] = (char) (chars[0] - 'a' + 'A');
        }

        return new String(chars);
    }
}
