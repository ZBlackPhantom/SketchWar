package templates;

import Game.StartUp;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import java.util.HashMap;
import java.util.Map;

public class GameImageView
{
    private Map<Label, ImageView> framesList = new HashMap<>();
    private ImageView logoImageView;
    private ImageView profileImageView;

    StartUp startUp;
    public GameImageView(StartUp startUp) {
        logoImageView = new ImageView(startUp.getGameImageInstance().getGameLogoImage());
        profileImageView = new ImageView(startUp.getGameImageInstance().getProfileImage());
        this.startUp = startUp;
    }

    public ImageView getGameLogoImageView() {
        return logoImageView;
    }
    public ImageView getProfileImageView() {
        return profileImageView;
    }
    public ImageView getSelectedFrameImageView(Label linkedText) {
        ImageView selectedFrame = new ImageView(startUp.getGameImageInstance().getUnSelectedFrameImage());
        framesList.put(linkedText , selectedFrame);
        return selectedFrame;
    }
    public ImageView getUnSelectedFrameImageView(Label linkedText) {
        ImageView unSelectedFrame = new ImageView(startUp.getGameImageInstance().getUnSelectedFrameImage());
        framesList.put(linkedText , unSelectedFrame);
        return unSelectedFrame;
    }

    public Map<Label, ImageView> getFramesList() {
        return framesList;
    }
}
