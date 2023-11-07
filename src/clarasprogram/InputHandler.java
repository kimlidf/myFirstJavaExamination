package clarasprogram;

public class InputHandler {

        private int lines;
        private int characters;
        private int words;
        private boolean stop;
        private String longest;

        public InputHandler(){
            lines = 0;
            characters = 0;
            words = 0;
            stop = false;
            longest = " ";
        }

        public void countLines(){
            lines++;
        }

        public void countCharacters(String input){
            characters += input.length();
        }

        public void countWords(String userInput){
            String[] wordArrays = userInput.split(" ");
            words += wordArrays.length;

            for (String word : wordArrays) {
                if (word.length() > longest.length()) {
                    longest = word;
                }
            }
        }

        public int getCharacters(){
            return characters;
        }

        public int getLines(){
            return lines;
        }

        public int getWords(){
            return words;
        }

        public boolean getStop(){
            return stop;
        }

        public void setStop(boolean stop){
            this.stop = stop;
        }

        public void checkForStop(String userInput){
            if (userInput.toLowerCase().equals("stop")){
                stop = true;
            }
        }

        public String getLongestWord() {
            return longest;
        }

        public static void printInformation(int characters, int lines, int words, String longestWord){
            System.out.println("Antal inmatade tecken: " + characters);
            System.out.println("Antal rader: " + lines);
            System.out.println("Antal ord: " + words);
            System.out.println("Det längsta inmatade ordet: " + longestWord);
        }
    }

