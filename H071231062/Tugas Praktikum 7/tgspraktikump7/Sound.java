package tgspraktikump7;

import javax.sound.sampled.*;

public class Sound {

    public static void playSound(String filePath) {
        try {
            Clip clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(Sound.class.getResourceAsStream(filePath));
            clip.open(inputStream);
            clip.start();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}

