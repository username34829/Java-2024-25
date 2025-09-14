import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        String word = "apple";

        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for(int i = 0; i < word.length(); i++){
            wordState.add('_');
        }

        System.out.println("[Welcome to Hangman Game]");

        while(wrongGuesses < 6){

            System.out.println(getHangmanArt(wrongGuesses));

            System.out.print("Word: ");
            for(char c : wordState){
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.print("Enter Guess Word: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if(word.indexOf(guess) >= 0){
                System.out.println("Correct!");

                for(int i = 0; i < word.length(); i++){
                    if(word.charAt(i) == guess){
                        wordState.set(i, guess);
                    }
                }

                if(!wordState.contains('_')){
                    System.out.println(getHangmanArt(wrongGuesses));
                    System.out.println("You win, Congrats!");
                    System.out.println("The word is: " + word);
                    break;
                }

            }
            else{
                wrongGuesses++;
                System.out.println("Wrong!");
            }

        }

        if(wrongGuesses == 6){
            System.out.println(getHangmanArt(wrongGuesses));
            System.out.println("You lose, Game Over!");
            System.out.println("The word is: " + word);
        }

        System.out.println();
        System.out.println("Program exiting...");
        System.out.println("Thank you for playing this game!");

    }
    static String getHangmanArt(int wrongGuesses){
        return switch (wrongGuesses){
            case 0 -> """
                      
                      
                      
                      """;
            case 1 -> """
                       o
                      
                      
                      """;
            case 2 -> """
                       o
                       |
                      
                      """;
            case 3 -> """
                       o
                       |\\
                      
                      """;
            case 4 -> """
                       o
                      /|\\
                      
                      """;
            case 5 -> """
                       o
                      /|\\
                      /
                      """;
            case 6 -> """
                       o
                      /|\\
                      / \\
                      """;
            default -> "";
        };
    }
}