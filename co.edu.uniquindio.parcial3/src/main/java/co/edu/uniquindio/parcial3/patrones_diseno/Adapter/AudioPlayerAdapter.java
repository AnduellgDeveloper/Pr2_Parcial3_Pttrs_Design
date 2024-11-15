package co.edu.uniquindio.parcial3.patrones_diseno.Adapter;

public class AudioPlayerAdapter implements MediaPlayer {
    private final LegacyAudioPlayer legacyPlayer;

    public AudioPlayerAdapter(LegacyAudioPlayer legacyPlayer) {
        this.legacyPlayer = legacyPlayer;
    }

    @Override
    public void play() {
        legacyPlayer.startPlayback();
    }

    @Override
    public void pause() {
        legacyPlayer.pausePlayback();
    }

    @Override
    public void stop() {
        legacyPlayer.haltPlayback();
    }
}
