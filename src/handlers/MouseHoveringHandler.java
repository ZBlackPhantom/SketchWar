package handlers;

import Game.StartUp;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.effect.Glow;
import javafx.scene.input.MouseEvent;

public class MouseHoveringHandler implements EventHandler<MouseEvent>
{
    private StartUp startUp;
    public MouseHoveringHandler(StartUp startUp) {
        this.startUp = startUp;
    }

    @Override
    public void handle(MouseEvent event)
    {
        if(event.getEventType().getSuperType().equals(MouseEvent.MOUSE_ENTERED_TARGET))
        {
            if(event.getSource() instanceof Label)
            {
                Label targetedLabel = (Label) event.getSource();
               if(startUp.getGameImageViewInstance().getFramesList().containsKey(targetedLabel))
               {
                   startUp.getSoundHandler().playOptionHoveringSound();

                   Glow effect = new Glow();
                   effect.setLevel(1);

                   targetedLabel.setEffect(effect);
                   startUp.getGameImageViewInstance().getFramesList().get(targetedLabel).setImage(startUp.getGameImageInstance().getSelectedFrameImage());

                   if(targetedLabel.getText().equals("Login"))
                   {

                   }
                   else if(targetedLabel.getText().equals("Register"))
                   {

                   }
                   else if(targetedLabel.getText().equals("Help"))
                   {

                   }
               }
            }
        }

        if(event.getEventType().getSuperType().equals(MouseEvent.MOUSE_EXITED_TARGET))
        {
            if(event.getSource() instanceof Label)
            {
                Label targetedLabel = (Label) event.getSource();
                if(startUp.getGameImageViewInstance().getFramesList().containsKey(targetedLabel))
                {
                    targetedLabel.setEffect(null);
                    startUp.getGameImageViewInstance().getFramesList().get(targetedLabel).setImage(startUp.getGameImageInstance().getUnSelectedFrameImage());
                }
            }
        }
    }
}
