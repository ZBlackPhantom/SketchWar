package Game;

import handlers.KeyBoardHandler;
import handlers.MouseClickingHandler;
import handlers.MouseHoveringHandler;
import handlers.SoundHandler;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;
import templates.GameImageView;
import templates.GameImages;
import templates.GameLabels;
import templates.GamePanes;

import java.io.File;


public class StartUp extends Application
{
    public static PaneViewing playerCurrentView;
    private GameImages gameImages = new GameImages();
    private GameLabels gameLabels = new GameLabels();
    private GameImageView gameImageView = new GameImageView(this);
    private GamePanes gamePanes = new GamePanes(this);

    private SoundHandler soundHandler = new SoundHandler();
    private MouseHoveringHandler mouseHoveringHandler = new MouseHoveringHandler(this);
    private MouseClickingHandler mouseClickingHandler = new MouseClickingHandler(this);

    private Scene scene;

    @Override
    public void start(Stage stage)
    {
        scene = new Scene(gamePanes.getOpeningPane() , 500 , 500);
        scene.setOnKeyPressed(new KeyBoardHandler(this));
        stage.getIcons().add( new Image(new File("Game Texture//Game Icon.png").toURI().toString()));
        stage.setTitle("Sketch War Alpha 1.0");
        stage.setResizable(false);

        stage.setScene(scene);
        stage.show();

        Timeline loadingDelay = new Timeline(new KeyFrame(Duration.seconds(5), event -> scene.setRoot(gamePanes.getStartPane())));
        loadingDelay.play();
    }

    public static void main(String[] args) {

        launch(args);
    }

    public GameLabels getGameLabelsInstance() {
        return gameLabels;
    }
    public GameImages getGameImageInstance() {
        return gameImages;
    }
    public GameImageView getGameImageViewInstance() {
        return gameImageView;
    }
    public GamePanes getGamePanesInstance() {
        return gamePanes;
    }

    public SoundHandler getSoundHandler() {
        return soundHandler;
    }
    public MouseHoveringHandler getMouseHoveringHandler() {
        return mouseHoveringHandler;
    }
    public MouseClickingHandler getMouseClickingHandler() {
        return mouseClickingHandler;
    }

    public Scene getGameScene() {
        return scene;
    }
}
