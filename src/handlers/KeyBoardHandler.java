package handlers;

import Game.PaneViewing;
import Game.StartUp;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import static Game.StartUp.playerCurrentView;

public class KeyBoardHandler implements EventHandler<KeyEvent>
{
    StartUp startUp;
    public KeyBoardHandler(StartUp startUp)
    {
            this.startUp = startUp;
    }

    @Override
    public void handle(KeyEvent event)
    {
        if(event.getCode().equals(KeyCode.ESCAPE))
        {
            if(playerCurrentView.equals(PaneViewing.Login) || playerCurrentView.equals(PaneViewing.Register) || playerCurrentView.equals(PaneViewing.Help))
            {
                playerCurrentView = PaneViewing.Begin;
                startUp.getGameScene().setRoot(startUp.getGamePanesInstance().getStartPane());
                startUp.getSoundHandler().playPageSelectingSound();
            }
        }
    }
}
