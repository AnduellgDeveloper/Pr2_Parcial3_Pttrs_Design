package co.edu.uniquindio.parcial3.patrones_diseno.Facade.viewController;
import co.edu.uniquindio.parcial3.patrones_diseno.Facade.model.SiriHome;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

public class SiriViewController {
    private SiriHome siriHome;
    @FXML
    public void initialize() {
        this.siriHome = new SiriHome(textAreaOutput);
    }
    @FXML
    private TextArea textAreaOutput;
    @FXML
    private Button btnModeAfternoon;
    @FXML
    private Button btnModeDay;
    @FXML
    private Button btnModeNight;
    @FXML
    private AnchorPane fondo;
    @FXML
    void onModeDay(ActionEvent event) {
        textAreaOutput.setText("");
        siriHome.modeDay();
        fondo.setStyle("-fx-background-color: #FFFF99;");
    }
    @FXML
    void onModeAfternoon(ActionEvent event) {
        textAreaOutput.setText("");
        siriHome.modeAfternoon();
        fondo.setStyle("-fx-background-color: #fa4d4d;");
    }
    @FXML
    void onModeNight(ActionEvent event) {
        textAreaOutput.setText("");
        siriHome.modeNight();
        fondo.setStyle("-fx-background-color: #03085d;");
    }
}
