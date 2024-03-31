package springhelloworld.model;

import java.util.Random;

public class StringHolder {
    private final String value;
    private final static String[] words = { "Cat", "Dog", "Snake", "Pigeon", "Raccoon" };

    public StringHolder() {
        value = words[new Random().nextInt(words.length)];
        System.out.println("Prototype instance created");
    }

    public String getValue() {
        return value;
    }


}
