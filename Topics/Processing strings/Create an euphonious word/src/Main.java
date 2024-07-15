import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(minInsertionsToEuphonious(word));
    }

    private static int minInsertionsToEuphonious(String word) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'y'));
        int insertions = 0;
        int vowelsInRow = 0;
        int consonantsInRow = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (vowels.contains(c)) {
                vowelsInRow++;
                consonantsInRow = 0;
            } else {
                consonantsInRow++;
                vowelsInRow = 0;
            }

            if (vowelsInRow == 3 || consonantsInRow == 3) {
                insertions++;
                vowelsInRow = 1;
                consonantsInRow = 1;
            }
        }

        return insertions;
    }
}