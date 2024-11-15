package co.edu.uniquindio.parcial3.patrones_diseno.Adapter;

public class LegacyAudioPlayer {
    public void startPlayback() {
        System.out.println("Iniciando reproducción...");
    }

    public void haltPlayback() {
        System.out.println("Deteniendo reproducción...");
    }

    public void pausePlayback() {
        System.out.println("Pausando reproducción...");
    }
}
