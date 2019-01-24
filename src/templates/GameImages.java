package templates;

import javafx.scene.image.Image;

import java.io.File;

public class GameImages
{
    private Image logoImage = new Image(new File("Game Texture//Sketch War.png").toURI().toString());
    private Image profileImage = new Image(new File("Game Texture//Default Profile.png").toURI().toString());
    private Image selectedFrameImage = new Image(new File("Game Texture//Selected_Frame.png").toURI().toString());
    private Image unSelectedFrameImage = new Image(new File("Game Texture//UnSelected_Frame.png").toURI().toString());

    public Image getGameLogoImage() {
        return logoImage;
    }
    public Image getProfileImage() {
        return profileImage;
    }
    public Image getSelectedFrameImage() {
        return selectedFrameImage;
    }
    public Image getUnSelectedFrameImage() {
        return unSelectedFrameImage;
    }
}

