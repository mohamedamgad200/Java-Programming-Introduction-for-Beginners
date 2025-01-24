import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WordQuestDemov2 {
    public static void main(String[] args) throws IOException {
        // Define the secret word and maximum allowed attempts
        String fileName="data/sample-words.txt";
        String secretWord = getRandomWord(fileName);
        int maxAttempts = 10;
        // Create a game board with underscores to represent unrevealed letters
        char[] gameBoard = new char[secretWord.length()];
        // Flag to check if the word has been has missing letters
        boolean hasMissingLetters = true;
        // Initialize game board with underscores to represent missing letters
//        for (int i = 0; i < gameBoard.length; i++) {
//            gameBoard[i] = '_';
//        }
        final char EMPTY_PLACE_HOLDER='-';
        Arrays.fill(gameBoard,EMPTY_PLACE_HOLDER);
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Welcome to Word Quest!");
        // Main game loop: runs while there are attempts left and the word is not has missing letter
        while (maxAttempts > 0 && hasMissingLetters) {
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
                // Check if the word has missing letter
                hasMissingLetters = contains(gameBoard,EMPTY_PLACE_HOLDER);
            } else {
                System.out.println("Incorrect!");
                maxAttempts--;
            }
            // Display remaining attempts after each guess
            System.out.println("Attempts remaining: " + maxAttempts);
            System.out.println();
        }
        // End of game message based on whether the word was has missing letters
        if (hasMissingLetters) {
            System.out.println("You've run out of attempts. The hidden word was: " + secretWord);
        } else {
            System.out.println("Success!!! You've revealed the word: " + new String(gameBoard));
        }
    }

    private static boolean contains(char[] gameBoard, char EMPTY_PLACE_HOLDER) {
        for (char c : gameBoard) {
            if (c == EMPTY_PLACE_HOLDER) {
                return true;
            }
        }
        return false;
    }

    private static String getRandomWord(String fileName) throws IOException {
        //String[] words = {"Java", "Airplane", "Friend"};
        // read in all lines from the file
        List<String>linesList= Files.readAllLines(Path.of(fileName));
        // convert the List to an Array
        String[] words =linesList.toArray(new String[0]);
        Random random = new Random();
        int index = random.nextInt(words.length);
        String theWord = words[index];
        return theWord.toUpperCase();
    }

}
