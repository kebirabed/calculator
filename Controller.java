package sample;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.event.ActionEvent;

public class Controller {
    @FXML
    private Button nine;
    @FXML
    private Button AC;
    @FXML
    private Button fois;
    @FXML
    private Button six;
    @FXML
    private Button one;
    @FXML
    private Button seven;
    @FXML
    private Button divise;
    @FXML
    private Button fore;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button plus;
    @FXML
    private Button eight;
    @FXML
    private Button equal;
    @FXML
    private Button zero;
    @FXML
    private Button moins;
    @FXML
    private Button five;
    @FXML
    private Button comma;
    @FXML
    private Label display;

    public void ButtonAction(ActionEvent a) {
        Button button = (Button)
                a.getSource();

        if (button.getId().equals("zero"))
            display.setText((display.getText() + "0"));
        if (button.getId().equals("one"))
            display.setText((display.getText() + "1"));
        if (button.getId().equals("two"))
            display.setText((display.getText() + "2"));
        if (button.getId().equals("three"))
            display.setText((display.getText() + "3"));
        if (button.getId().equals("fore"))
            display.setText((display.getText() + "4"));
        if (button.getId().equals("five"))
            display.setText((display.getText() + "5"));
        if (button.getId().equals("six"))
            display.setText((display.getText() + "6"));
        if (button.getId().equals("seven"))
            display.setText((display.getText() + "7"));
        if (button.getId().equals("eight"))
            display.setText((display.getText() + "8"));
        if (button.getId().equals("nine"))
            display.setText((display.getText() + "9"));
        if (button.getId().equals("comma"))
            display.setText((display.getText() + ","));
    }
    public void Cancel(ActionEvent a) {
        Button button = (Button)
                a.getSource();

        if (button.getId().equals("AC"))
            display.setText("0");
}
}