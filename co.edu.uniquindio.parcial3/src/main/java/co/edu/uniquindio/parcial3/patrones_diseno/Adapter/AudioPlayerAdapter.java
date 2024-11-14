package co.edu.uniquindio.parcial3.patrones_diseno.Adapter;

public class AudioPlayerAdapter implements IMediaPlayer {
    private LegacyAudioPlayer legacyAudioPlayer;

    public AudioPlayerAdapter(LegacyAudioPlayer legacyAudioPlayer) {
        this.legacyAudioPlayer = legacyAudioPlayer;
    }

    @Override
    public void play() {
        legacyAudioPlayer.startPlayback();
    }

    @Override
    public void pause() {
        System.out.println("Pausa no soportada en LegacyAudioPlayer.");
    }

    @Override
    public void stop() {
        legacyAudioPlayer.haltPlayback();
    }
}
