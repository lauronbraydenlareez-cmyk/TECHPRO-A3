import java.util.Scanner;
import java.util.Random;

public class SeatWork9Task6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] words = {"java", "programming", "hangman", "computer", "keyboard", "internet", "developer"};
        String wordToGuess = words[random.nextInt(words.length)];
        int wordLength = wordToGuess.length();

        char[] guessedWord = new char[wordLength];
        for (int i = 0; i < wordLength; i++) {
            guessedWord[i] = '_';
        }

        int maxAttempts = 6;
        int wrongAttempts = 0;
        boolean wordGuessed = false;

        System.out.println("Welcome to Hangman! 🎮");
        System.out.println("Try to guess the word.");

        while (wrongAttempts < maxAttempts && !wordGuessed) {
            System.out.print("\nWord: ");
            for (char c : guessedWord) {
                System.out.print(c + " ");
            }

            System.out.print("\nGuess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            boolean correctGuess = false;

            // Check if the guessed letter is in the word
            for (int i = 0; i < wordLength; i++) {
                if (wordToGuess.charAt(i) == guess && guessedWord[i] == '_') {
                    guessedWord[i] = guess;
                    correctGuess = true;
                }
            }

            if (correctGuess) {
                System.out.println("Good guess! ✅");
            } else {
                wrongAttempts++;
                System.out.println("Wrong guess! ❌ Attempts left: " + (maxAttempts - wrongAttempts));
            }

            // Check if the whole word is guessed
            wordGuessed = true;
            for (char c : guessedWord) {
                if (c == '_') {
                    wordGuessed = false;
                    break;
                }
            }
        }

        // End game
        if (wordGuessed) {
            System.out.print("\nCongratulations! You guessed the word: ");
            System.out.println(wordToGuess + " 🎉");
        } else {
            System.out.print("\nGame Over! The word was: ");
            System.out.println(wordToGuess + " ☠️");
        }

        scanner.close();
    }
}
