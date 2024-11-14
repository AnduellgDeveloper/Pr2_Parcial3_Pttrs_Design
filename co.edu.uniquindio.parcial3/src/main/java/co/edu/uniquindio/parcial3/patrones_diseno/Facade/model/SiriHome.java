package co.edu.uniquindio.parcial3.patrones_diseno.Facade.model;

import javafx.scene.control.TextArea;

public class SiriHome {
    private Leds leds;
    private Heating heating;
    private Locks locks;
    private TextArea textArea;

    public SiriHome(TextArea textArea) {
        this.leds = new Leds();
        this.heating = new Heating();
        this.locks = new Locks();
        this.textArea = textArea;
    }



    public void modeDay(){
        textArea.appendText("Activando modo día\n");
        leds.offLeds(textArea);
        heating.offHeating(textArea);
        locks.unlock(textArea);
        textArea.appendText("Modo día activado\n");
    }

    public void modeAfternoon(){
        textArea.appendText("Activando modo tarde\n");
        leds.offLeds(textArea);
        heating.offHeating(textArea);
        locks.lock(textArea);
        textArea.appendText("Modo tarde activado\n");

    }
    public void modeNight(){
        textArea.appendText("Activando modo noche\n");
        leds.onLeds(textArea);
        heating.onHeating(textArea);
        locks.lock(textArea);
        textArea.appendText("Modo noche activado\n");
    }

    public Leds getLeds() {
        return leds;
    }

    public void setLeds(Leds leds) {
        this.leds = leds;
    }

    public Heating getHeating() {
        return heating;
    }

    public void setHeating(Heating heating) {
        this.heating = heating;
    }

    public Locks getLocks() {
        return locks;
    }

    public void setLocks(Locks locks) {
        this.locks = locks;
    }
}
