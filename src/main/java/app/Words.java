package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Words {
    List<String> words = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten");

    List<String> randomWords = new ArrayList<>();

    public void randomize() {
        Random random = new Random();
        randomWords.clear();
        for (int i = 0; i<5; i++){
            int index = random.nextInt(words.size());
            String newWord = words.get(index);
            randomWords.add(newWord);
        }
    }

    public List<String> getRandomWords() {
        return randomWords;
    }
}
