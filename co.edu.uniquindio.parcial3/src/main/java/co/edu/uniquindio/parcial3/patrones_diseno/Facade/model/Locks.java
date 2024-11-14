package co.edu.uniquindio.parcial3.patrones_diseno.Facade.model;

import javafx.scene.control.TextArea;

public class Locks {
    private TextArea textArea;
    public void lock(TextArea textArea){
        textArea.appendText("Cerraduras bloqueadas\n");
    }
    public void unlock(TextArea textArea){
        textArea.appendText("Cerraduras desbloqueadas\n");
    }
}
