import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SimpleHangman {
    public static void main(String[] args){
        //This is a word guessing game app in Java. This game is a simpler version of Hangman.

        ArrayList<String> words = new ArrayList<>();
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int wrongGuess = 0;
        char[] myCharArray;

        words.add("tree");
        words.add("rain");
        words.add("bear");
        words.add("encourage");
        words.add("promise");
        words.add("soup");
        words.add("chess");
        words.add("insurance");
        words.add("pancakes");
        words.add("stream");

        int randIndex = rand.nextInt(words.size());
        String randWord = words.get(randIndex);
        myCharArray = randWord.toCharArray();
        int randWordLength = randWord.length();

        System.out.println(myCharArray);

        System.out.println("Welcome, let's play hangman!");
        System.out.print("Here is the word I am thinking of: " );

        char[] attemptHistory = new char[randWordLength];
        for (int i = 0; i < randWord.length(); i++) {
            attemptHistory[i] = '_';
            System.out.print(attemptHistory[i]);
        }


        do {
//            wrongGuess++;
            System.out.println();
            System.out.print("\nEnter letter or word guess: ");
            String userGuessWord = input.nextLine();
            char userGuess = userGuessWord.charAt(0);

            if (userGuessWord.equals(randWord)){
                System.out.println("\nYou've won! The word was " + randWord);
                break;

            }else{

                wrongGuess++;
                System.out.println("You have guessed incorrectly " + wrongGuess + "/6 times.");


                System.out.print("Your guess so far: ");
                for (int i = 0; i < randWord.length(); i++) {
                    if ( userGuess == myCharArray[i] )
                        attemptHistory[i] = userGuess;
                        System.out.print(attemptHistory[i]);
                }

                String str = new String(attemptHistory);
//                System.out.println("\nconverting to String: " + str);

                if (str.equals(randWord)){
                    System.out.println("\nYou've won! The word was " + randWord);
                    break;
                }

            }
        }while(wrongGuess < 6);

        System.out.println("\nThank you for playing!");
















    }
}
