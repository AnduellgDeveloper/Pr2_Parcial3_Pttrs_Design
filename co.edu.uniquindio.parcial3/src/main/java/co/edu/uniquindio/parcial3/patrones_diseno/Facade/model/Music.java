package co.edu.uniquindio.parcial3.patrones_diseno.Facade.model;

import javafx.scene.control.TextArea;

public class Music {
    private String song;

    public Music(String song) {
        this.song = song;
    }

    public void onMusic(TextArea textArea){
        System.out.println("Abriendo Spotify... Reproduciendo  "+ song + ".\n");
    }
    public void offMusic(TextArea textArea){
        System.out.println("Cerrando Spotify... Pausando "+ song + ".\n");
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }
}
