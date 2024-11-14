package co.edu.uniquindio.parcial3.patrones_diseno.Facade.model;

import javafx.scene.control.TextArea;

public class Heating {
    public void onHeating(TextArea textArea){
        textArea.appendText("Calefacción encendidad\n");
    }
    public void offHeating(TextArea textArea){
        textArea.appendText("Calefacción apagada\n");
    }
}
