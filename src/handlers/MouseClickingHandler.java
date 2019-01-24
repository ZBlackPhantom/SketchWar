package handlers;

import Game.StartUp;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;


public class MouseClickingHandler implements EventHandler<MouseEvent>
{
    StartUp startUp;
    public MouseClickingHandler(StartUp startUp) {
        this.startUp = startUp;
    }

    @Override
    public void handle(MouseEvent event) {
        if (event.getSource() instanceof Label)
        {
            Label targetedLabel = (Label) event.getSource();

            if (targetedLabel.equals(startUp.getGameLabelsInstance().getLoginLabel()))
            {
                startUp.getGameScene().setRoot(startUp.getGamePanesInstance().getLoginPane());
                startUp.getSoundHandler().playPageSelectingSound();
            }

            if (targetedLabel.equals(startUp.getGameLabelsInstance().getRegisterLabel()))
            {
                startUp.getGameScene().setRoot(startUp.getGamePanesInstance().getRegisterPane());
                startUp.getSoundHandler().playPageSelectingSound();
            }

            if (targetedLabel.equals(startUp.getGameLabelsInstance().getHelpLabel()))
            {
                startUp.getGameScene().setRoot(startUp.getGamePanesInstance().getHelpPane());
                startUp.getSoundHandler().playPageSelectingSound();
            }
        }
    }
}
