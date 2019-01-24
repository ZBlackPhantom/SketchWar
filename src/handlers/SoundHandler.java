package handlers;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

public class SoundHandler
{
    void playPageSelectingSound() {
        Media sound = new Media(new File("Game Sounds//Page_Select.wav").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }

    void playOptionHoveringSound() {
        Media sound = new Media(new File("Game Sounds//Button_Click.wav").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }
}
