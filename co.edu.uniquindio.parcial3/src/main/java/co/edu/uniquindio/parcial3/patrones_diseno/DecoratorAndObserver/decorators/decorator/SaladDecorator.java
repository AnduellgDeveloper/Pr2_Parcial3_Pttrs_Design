package co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.decorators.decorator;

import co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.decorators.service.ILunch;

public class SaladDecorator extends LunchDecorator {

    public SaladDecorator(ILunch iLunch) {
        super(iLunch);
    }
    @Override
    public double getCost(){
        return super.getCost() + 2000;
    }
    @Override
    public String getAdds() {
        return super.getAdds() + ", Ensalada sencilla\n";
    }
}
