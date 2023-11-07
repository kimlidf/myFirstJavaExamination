package clarasprogram;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

            InputHandler inputHandler = new InputHandler();

            Scanner scan = new Scanner(System.in);
            System.out.println("Skriv din text, avsluta med \"stop\".");


            while (!inputHandler.getStop()) {
                String userInput = scan.nextLine();
                inputHandler.checkForStop(userInput);

                if (!inputHandler.getStop()) {
                    inputHandler.countLines();
                    inputHandler.countCharacters(userInput);
                    inputHandler.countWords(userInput);
                }
            }

            inputHandler.printInformation(inputHandler.getCharacters(),
                    inputHandler.getLines(), inputHandler.getWords(), inputHandler.getLongestWord());
        }
    }


