import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WordQuestDemo {
    public static void main(String[] args) {
        // Define the secret word and maximum allowed attempts
        String secretWord = getRandomWord();
        int maxAttempts = 10;
        // Create a game board with underscores to represent unrevealed letters
        char[] gameBoard = new char[secretWord.length()];
        // Flag to check if the word has been fully revealed
        boolean wordNotRevealed = true;
        // Initialize game board with underscores to represent missing letters
//        for (int i = 0; i < gameBoard.length; i++) {
//            gameBoard[i] = '_';
//        }
        Arrays.fill(gameBoard,'_');
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Welcome to Word Quest!");
        // Main game loop: runs while there are attempts left and the word is not fully revealed
        while (maxAttempts > 0 && wordNotRevealed) {
            System.out.print("Current word: ");
            System.out.println(gameBoard);
            System.out.println();
            System.out.println("Guess a letter: ");
            // Read the user's input, take the first character, and convert it to uppercase
            String userInput = scanner.next().toUpperCase();
            char guess = userInput.charAt(0);
            // Track if the guess was correct
            boolean isGuessCorrect = false;
            // Loop through each letter in the secret word to check if it matches the guess
            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == guess) {
                    // Reveal the correctly guessed letter on the game board
                    gameBoard[i] = guess;
                    isGuessCorrect = true;
                }
            }
            if (isGuessCorrect) {
                System.out.println("Good job! You found a match!");
                // Check if there are still unrevealed letters
                wordNotRevealed = containsUnderscore(gameBoard);
            } else {
                System.out.println("Incorrect!");
                maxAttempts--;
            }
            // Display remaining attempts after each guess
            System.out.println("Attempts remaining: " + maxAttempts);
            System.out.println();
        }
        // End of game message based on whether the word was revealed
        if (wordNotRevealed) {
            System.out.println("You've run out of attempts. The hidden word was: " + secretWord);
        } else {
            System.out.println("Success!!! You've revealed the word: " + new String(gameBoard));
        }
    }

    private static boolean containsUnderscore(char[] gameBoard) {
        for (char c : gameBoard) {
            if (c == '_') {
                return true;
            }
        }
        return false;
    }

    private static String getRandomWord() {
        String[] words = {"Java", "Airplane", "Friend"};
        Random random = new Random();
        int index = random.nextInt(words.length);
        String theWord = words[index];
        return theWord.toUpperCase();
    }

}
