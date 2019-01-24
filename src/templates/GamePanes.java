package templates;

import Game.StartUp;
import Game.PaneViewing;
import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.util.Duration;

import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

import static Game.StartUp.playerCurrentView;


public class GamePanes
{
    private StartUp startUp;
    public GamePanes(StartUp main)
    {
        startUp = main;
    }

   public Pane getOpeningPane() {

       playerCurrentView = PaneViewing.Load;

       ImageView gameLogo = startUp.getGameImageViewInstance().getGameLogoImageView();
       gameLogo.setFitWidth(480);
       gameLogo.setFitHeight(140);
       gameLogo.setX(15);
       gameLogo.setY(0);

       FadeTransition gameLogoAnimator = new FadeTransition();
       gameLogoAnimator.setFromValue(0);
       gameLogoAnimator.setToValue(1);
       gameLogoAnimator.setDuration(new Duration(3500));
       gameLogoAnimator.setNode(gameLogo);
       gameLogoAnimator.play();



       Glow waterMarkEffect = new Glow();
       waterMarkEffect.setLevel(1);

       Text waterMark = new Text("Property Of ZBlackPhantom");
       waterMark.setLayoutX(110);
       waterMark.setLayoutY(480);
       waterMark.setFont(new Font("Impact" , 25));
       waterMark.setFill(Color.valueOf("#004a7f"));
       waterMark.setEffect(waterMarkEffect);

       FadeTransition waterMarkAnimator = new FadeTransition();
       waterMarkAnimator.setFromValue(0);
       waterMarkAnimator.setToValue(1);
       waterMarkAnimator.setDuration(new Duration(3500));
       waterMarkAnimator.setNode(waterMark);
       waterMarkAnimator.play();



       Rectangle loader1 = new Rectangle();
       loader1.setX(0);
       loader1.setY(0);
       loader1.setWidth(5);
       loader1.setHeight(5);
       loader1.setFill(Color.valueOf("#004a7f"));

       ScaleTransition loader1animation = new ScaleTransition();
       loader1animation.setDuration(new Duration(4000));
       loader1animation.setFromX(0);
       loader1animation.setToX(210);
       loader1animation.setNode(loader1);
       loader1animation.play();



       Rectangle loader2 = new Rectangle();
       loader2.setX(505);
       loader2.setY(0);
       loader2.setWidth(5);
       loader2.setHeight(5);
       loader2.setFill(Color.valueOf("#004a7f"));

       ScaleTransition loader2animation = new ScaleTransition();
       loader2animation.setDuration(new Duration(4000));
       loader2animation.setFromY(0);
       loader2animation.setToY(210);
       loader2animation.setNode(loader2);
       loader2animation.play();



       Rectangle loader3 = new Rectangle();
       loader3.setX(0);
       loader3.setY(505);
       loader3.setWidth(5);
       loader3.setHeight(5);
       loader3.setFill(Color.valueOf("#004a7f"));

       ScaleTransition loader3animation = new ScaleTransition();
       loader3animation.setDuration(new Duration(4000));
       loader3animation.setFromY(0);
       loader3animation.setToY(-210);
       loader3animation.setNode(loader3);
       loader3animation.play();



       Rectangle loader4 = new Rectangle();
       loader4.setX(505);
       loader4.setY(505);
       loader4.setWidth(5);
       loader4.setHeight(5);
       loader4.setFill(Color.valueOf("#004a7f"));

       ScaleTransition loader4animation = new ScaleTransition();
       loader4animation.setDuration(new Duration(4000));
       loader4animation.setFromX(0);
       loader4animation.setToX(-210);
       loader4animation.setNode(loader4);
       loader4animation.play();



       TimerTask timerTask = new TimerTask()
       {
           @Override
           public void run()
           {
               gameLogoAnimator.stop();
               waterMarkAnimator.stop();
               loader1animation.stop();
               loader2animation.stop();
               loader3animation.stop();
               loader4animation.stop();
           }
       };
       Timer timer = new Timer();
       timer.schedule(timerTask , 4000);



       Pane pane = new Pane();
       pane.setBackground(new Background(new BackgroundFill(Color.BLACK , null , null)));
       pane.getChildren().addAll(gameLogo , waterMark , loader1 , loader2 , loader3 , loader4);

       return pane;
   }

    public Pane getStartPane() {

        playerCurrentView = PaneViewing.Begin;

        ImageView gameLogo = startUp.getGameImageViewInstance().getGameLogoImageView();
        gameLogo.setFitWidth(480);
        gameLogo.setFitHeight(140);
        gameLogo.setX(15);
        gameLogo.setY(0);



        Label loginLabel = startUp.getGameLabelsInstance().getLoginLabel();
        loginLabel.setTextFill(Color.valueOf("#004a7f"));
        loginLabel.setFont(new Font("Impact" , 35));
        loginLabel.setAlignment(Pos.CENTER);
        loginLabel.setLayoutX(145);
        loginLabel.setLayoutY(163);
        loginLabel.setPrefWidth(190);
        loginLabel.setOnMouseEntered(startUp.getMouseHoveringHandler());
        loginLabel.setOnMouseExited(startUp.getMouseHoveringHandler());
        loginLabel.setOnMouseClicked(startUp.getMouseClickingHandler());


        ImageView loginFrame = startUp.getGameImageViewInstance().getUnSelectedFrameImageView(loginLabel);
        loginFrame.setFitWidth(200);
        loginFrame.setFitHeight(50);
        loginFrame.setX(140);
        loginFrame.setY(160);
        loginFrame.setOnMouseEntered(startUp.getMouseHoveringHandler());
        loginFrame.setOnMouseExited(startUp.getMouseHoveringHandler());



        Label registerLabel = startUp.getGameLabelsInstance().getRegisterLabel();
        registerLabel.setTextFill(Color.valueOf("#004a7f"));
        registerLabel.setFont(new Font("Impact" , 35));
        registerLabel.setAlignment(Pos.CENTER);
        registerLabel.setLayoutX(145);
        registerLabel.setLayoutY(233);
        registerLabel.setPrefWidth(190);
        registerLabel.setOnMouseEntered(startUp.getMouseHoveringHandler());
        registerLabel.setOnMouseExited(startUp.getMouseHoveringHandler());
        registerLabel.setOnMouseClicked(startUp.getMouseClickingHandler());

        ImageView registerFrame = startUp.getGameImageViewInstance().getUnSelectedFrameImageView(registerLabel);
        registerFrame.setFitWidth(200);
        registerFrame.setFitHeight(50);
        registerFrame.setX(140);
        registerFrame.setY(230);
        registerFrame.setOnMouseEntered(startUp.getMouseHoveringHandler());
        registerFrame.setOnMouseExited(startUp.getMouseHoveringHandler());



        Label helpLabel = startUp.getGameLabelsInstance().getHelpLabel();
        helpLabel.setTextFill(Color.valueOf("#004a7f"));
        helpLabel.setFont(new Font("Impact" , 35));
        helpLabel.setAlignment(Pos.CENTER);
        helpLabel.setLayoutX(145);
        helpLabel.setLayoutY(303);
        helpLabel.setPrefWidth(190);
        helpLabel.setOnMouseEntered(startUp.getMouseHoveringHandler());
        helpLabel.setOnMouseExited(startUp.getMouseHoveringHandler());
        helpLabel.setOnMouseClicked(startUp.getMouseClickingHandler());

        ImageView helpFrame = startUp.getGameImageViewInstance().getUnSelectedFrameImageView(helpLabel);
        helpFrame.setFitWidth(200);
        helpFrame.setFitHeight(50);
        helpFrame.setX(140);
        helpFrame.setY(300);
        helpFrame.setOnMouseEntered(startUp.getMouseHoveringHandler());
        helpFrame.setOnMouseExited(startUp.getMouseHoveringHandler());

        Glow waterMarkEffect = new Glow();
        waterMarkEffect.setLevel(1);

        Text waterMark = new Text("Property Of ZBlackPhantom");
        waterMark.setLayoutX(110);
        waterMark.setLayoutY(480);
        waterMark.setFont(new Font("Impact" , 25));
        waterMark.setFill(Color.valueOf("#004a7f"));
        waterMark.setEffect(waterMarkEffect);

        Pane pane = new Pane();
        pane.setBackground(new Background(new BackgroundFill(Color.BLACK , null , null)));
        pane.getChildren().addAll(gameLogo , loginLabel , loginFrame , registerLabel , registerFrame , helpLabel , helpFrame , waterMark);

        return pane;
    }

    public Pane getLoginPane() {

        playerCurrentView = PaneViewing.Login;

        ImageView gameLogo = startUp.getGameImageViewInstance().getGameLogoImageView();
        gameLogo.setFitWidth(480);
        gameLogo.setFitHeight(140);
        gameLogo.setX(15);
        gameLogo.setY(0);

        Label loginPageLabel = new Label("< /Login Page Details/ >");
        loginPageLabel.setTextFill(Color.valueOf("#004a7f"));
        loginPageLabel.setFont(new Font("Impact" , 20));
        loginPageLabel.setAlignment(Pos.CENTER);
        loginPageLabel.setLayoutX(150);
        loginPageLabel.setLayoutY(250);

        Glow waterMarkEffect = new Glow();
        waterMarkEffect.setLevel(1);

        Text waterMark = new Text("Property Of ZBlackPhantom");
        waterMark.setLayoutX(110);
        waterMark.setLayoutY(480);
        waterMark.setFont(new Font("Impact" , 25));
        waterMark.setFill(Color.valueOf("#004a7f"));
        waterMark.setEffect(waterMarkEffect);

        Pane pane = new Pane();
        pane.setBackground(new Background(new BackgroundFill(Color.BLACK , null , null)));
        pane.getChildren().addAll(gameLogo , loginPageLabel , waterMark);

        return pane;
    }

    public Pane getRegisterPane() {

        playerCurrentView = PaneViewing.Register;

        ImageView gameLogo = startUp.getGameImageViewInstance().getGameLogoImageView();
        gameLogo.setFitWidth(480);
        gameLogo.setFitHeight(140);
        gameLogo.setX(15);
        gameLogo.setY(0);

        Label registerPageLabel = new Label("< /Register Page Details/ >");
        registerPageLabel.setTextFill(Color.valueOf("#004a7f"));
        registerPageLabel.setFont(new Font("Impact" , 20));
        registerPageLabel.setAlignment(Pos.CENTER);
        registerPageLabel.setLayoutX(150);
        registerPageLabel.setLayoutY(250);

        Glow waterMarkEffect = new Glow();
        waterMarkEffect.setLevel(1);

        Text waterMark = new Text("Property Of ZBlackPhantom");
        waterMark.setLayoutX(110);
        waterMark.setLayoutY(480);
        waterMark.setFont(new Font("Impact" , 25));
        waterMark.setFill(Color.valueOf("#004a7f"));
        waterMark.setEffect(waterMarkEffect);

        Pane pane = new Pane();
        pane.setBackground(new Background(new BackgroundFill(Color.BLACK , null , null)));
        pane.getChildren().addAll(gameLogo , registerPageLabel , waterMark);

        return pane;
    }

    public Pane getHelpPane() {

        playerCurrentView = PaneViewing.Help;

        ImageView gameLogo = startUp.getGameImageViewInstance().getGameLogoImageView();
        gameLogo.setFitWidth(480);
        gameLogo.setFitHeight(140);
        gameLogo.setX(15);
        gameLogo.setY(0);

        Text textQuestionLine1 = new Text("What is SketchWar?");
        textQuestionLine1.setFont(new Font("Arial" , 16));
        textQuestionLine1.setFill(Color.WHITE);
        textQuestionLine1.setLayoutX(15);
        textQuestionLine1.setLayoutY(150);

        Text textAnswerLine1 = new Text("- SketchWar is a combat game.");
        textAnswerLine1.setFont(new Font("Arial" , 16));
        textAnswerLine1.setFill(Color.valueOf("#004a7f"));
        textAnswerLine1.setLayoutX(15);
        textAnswerLine1.setLayoutY(170);


        Text textQuestionLine2 = new Text("How long did it take to develop Sketch War?");
        textQuestionLine2.setFont(new Font("Arial" , 16));
        textQuestionLine2.setFill(Color.WHITE);
        textQuestionLine2.setLayoutX(15);
        textQuestionLine2.setLayoutY(200);

        Text textAnswerLine2 = new Text("- | Alpha (1 month) | Beta (N/A) | release (N/A) |");
        textAnswerLine2.setFont(new Font("Arial" , 16));
        textAnswerLine2.setFill(Color.valueOf("#004a7f"));
        textAnswerLine2.setLayoutX(15);
        textAnswerLine2.setLayoutY(220);


        Text textQuestionLine3 = new Text("Who/What is ZBLackPhantom?");
        textQuestionLine3.setFont(new Font("Arial" , 16));
        textQuestionLine3.setFill(Color.WHITE);
        textQuestionLine3.setLayoutX(15);
        textQuestionLine3.setLayoutY(250);

        Text textAnswerLine3 = new Text("- ZBlackPhantom is the developer of SketchWar.");
        textAnswerLine3.setFont(new Font("Arial" , 16));
        textAnswerLine3.setFill(Color.valueOf("#004a7f"));
        textAnswerLine3.setLayoutX(15);
        textAnswerLine3.setLayoutY(270);


        Text textQuestionLine4 = new Text("Can I purchase InGame coins?");
        textQuestionLine4.setFont(new Font("Arial" , 16));
        textQuestionLine4.setFill(Color.WHITE);
        textQuestionLine4.setLayoutX(15);
        textQuestionLine4.setLayoutY(300);

        Text textAnswerLine4 = new Text("- Sadly SketchWar doesn't support that.");
        textAnswerLine4.setFont(new Font("Arial" , 16));
        textAnswerLine4.setFill(Color.valueOf("#004a7f"));
        textAnswerLine4.setLayoutX(15);
        textAnswerLine4.setLayoutY(320);


        Text textQuestionLine5 = new Text("What if I wanted to donate for the game SketchWar?");
        textQuestionLine5.setFont(new Font("Arial" , 16));
        textQuestionLine5.setFill(Color.WHITE);
        textQuestionLine5.setLayoutX(15);
        textQuestionLine5.setLayoutY(350);

        Text textAnswerLine5 = new Text("- You can donate to by PayPal. {PayPal}");
        textAnswerLine5.setFont(new Font("Arial" , 16));
        textAnswerLine5.setFill(Color.valueOf("#004a7f"));
        textAnswerLine5.setLayoutX(15);
        textAnswerLine5.setLayoutY(370);


        Text textQuestionLine6 = new Text("Does SketchWar have any website?");
        textQuestionLine6.setFont(new Font("Arial" , 16));
        textQuestionLine6.setFill(Color.WHITE);
        textQuestionLine6.setLayoutX(15);
        textQuestionLine6.setLayoutY(400);

        Text textAnswerLine6 = new Text("- Yes all of OKA games can be found on our website. {Website}");
        textAnswerLine6.setFont(new Font("Arial" , 16));
        textAnswerLine6.setFill(Color.valueOf("#004a7f"));
        textAnswerLine6.setLayoutX(15);
        textAnswerLine6.setLayoutY(420);

        ImageView megaGameLogo = new ImageView(new Image(new File("Game Texture//Mega Game Icon.png").toURI().toString()));
        megaGameLogo.setX(380);
        megaGameLogo.setY(130);
        megaGameLogo.setFitWidth(100);
        megaGameLogo.setFitHeight(100);


        Glow waterMarkEffect = new Glow();
        waterMarkEffect.setLevel(1);

        Text waterMark = new Text("Property Of ZBlackPhantom");
        waterMark.setLayoutX(110);
        waterMark.setLayoutY(480);
        waterMark.setFont(new Font("Impact" , 25));
        waterMark.setFill(Color.valueOf("#004a7f"));
        waterMark.setEffect(waterMarkEffect);

        Pane pane = new Pane();
        pane.setBackground(new Background(new BackgroundFill(Color.BLACK , null , null)));
        pane.getChildren().addAll(gameLogo , textQuestionLine1 , textAnswerLine1 , textQuestionLine2 , textAnswerLine2 , textQuestionLine3 , textAnswerLine3 , textQuestionLine4 , textAnswerLine4 , textQuestionLine5 , textAnswerLine5 , textQuestionLine6 , textAnswerLine6 , megaGameLogo , waterMark);

        return pane;
    }
}
