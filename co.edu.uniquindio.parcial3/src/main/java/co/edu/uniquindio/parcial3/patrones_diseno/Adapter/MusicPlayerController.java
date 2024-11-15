package co.edu.uniquindio.parcial3.patrones_diseno.Adapter;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MusicPlayerController {
    private final MediaPlayer mediaPlayer;

    @FXML
    private Button playButton;

    @FXML
    private Button pauseButton;

    @FXML
    private Button stopButton;

    public MusicPlayerController() {
        LegacyAudioPlayer legacyPlayer = new LegacyAudioPlayer();
        mediaPlayer = new AudioPlayerAdapter(legacyPlayer);
    }

    @FXML
    public void initialize() {
        playButton.setOnAction(event -> mediaPlayer.play());
        pauseButton.setOnAction(event -> mediaPlayer.pause());
        stopButton.setOnAction(event -> mediaPlayer.stop());
    }
}
