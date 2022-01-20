package io.gawish.singleton;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Sound {
    private static Sound sound = new Sound();

    private Sound() {}

    public static Sound getInstance() {
        return sound;
    }

    public void play(String file) {
        System.out.println("Playing " + file);
    }
}
