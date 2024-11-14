package co.edu.uniquindio.parcial3.patrones_diseno.Facade.model;

import javafx.scene.control.TextArea;

public class Leds {
    public void onLeds(TextArea textArea){
        textArea.appendText("Luces encedidas\n");
    }
    public void offLeds(TextArea textArea){
        textArea.appendText("Luces apagadas\n");
    }
}
