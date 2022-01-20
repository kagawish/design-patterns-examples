package io.gawish.observer;

public class AudioSystem implements Observer {
    private static AudioSystem instance = null;

    private AudioSystem() {}

    public static AudioSystem getInstance() {
        if (instance == null) {
            instance = new AudioSystem();
        }
        return instance;
    }

    public void playFallingSound() {
        System.out.println("Playing player falling sound");
    }

    public void onNotify(String event) {
        if (event.compareTo("PLAYER_FALL") == 0) {
            this.playFallingSound();
        }
    }
}
