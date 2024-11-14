package co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.decorators.model;

import co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.decorators.service.ILunch;

public class SimpleLunch implements ILunch {

    @Override
    public double getCost() {
        return + 4000;
    }
    @Override
    public String getAdds() {
        return "Bandeja super corriente\n";
    }
    @Override
    public String getUtils() {
        return "";
    }
}
