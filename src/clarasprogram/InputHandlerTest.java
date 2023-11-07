package clarasprogram;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class InputHandlerTest {

        InputHandler inputHandler = new InputHandler();

        @Test
        public void countCharactersTest(){
            inputHandler.countCharacters("Trying this out!");
            int actual = inputHandler.getCharacters();
            int expected = 16;

            assertEquals(expected, actual);
        }

        @Test
        public void countLinesTest(){
            inputHandler.countLines();
            int actual = inputHandler.getLines();
            int expected = 1;

            assertEquals(expected, actual);

        }
        @Test
        public void multipleLinesTest() {
            inputHandler.countLines();
            inputHandler.countCharacters("Min första rad text");
            inputHandler.countLines();
            inputHandler.countCharacters("Min andra rad text");
            int actual = inputHandler.getLines();
            int expected = 2;

            assertEquals(expected, actual);
        }
        @Test
        public void setStopTest(){
                inputHandler.setStop(true);
                boolean actual = inputHandler.getStop();
                boolean expected = true;

                assertEquals(expected, actual);
            }

        @Test
        public void getLongestWordTest() {
             inputHandler.countWords("The longest word is this");
             String actual = inputHandler.getLongestWord();
             String expected = "longest";

             assertEquals(expected, actual);
        }

    }