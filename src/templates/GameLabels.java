package templates;

import javafx.scene.control.Label;

public class GameLabels
{
    private Label loginLabel = new Label("Login");
    private Label registerLabel = new Label("Register");
    private Label helpLabel = new Label("Help");

    public Label getLoginLabel()
    {
        return loginLabel;
    }
    public Label getRegisterLabel()
    {
        return registerLabel;
    }
    public Label getHelpLabel()
    {
        return helpLabel;
    }
}
