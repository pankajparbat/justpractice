package DSA.first;

public class permutation_string {
    public static void main(String[] args) {
        String input = "abc";
        System.out.println("Permutations of '" + input + "':");
        generatePermutations(input, "");
    }

    public static void generatePermutations(String input, String currentPermutation) {
        int length = input.length();


        if (currentPermutation.length() == length) {
            System.out.println(currentPermutation);
        } else {
            for (int i = 0; i < length; i++) {
                char ch = input.charAt(i);

                if (currentPermutation.indexOf(ch) == -1) {

                    generatePermutations(input, currentPermutation + ch);
                }
            }
        }
    }
}
