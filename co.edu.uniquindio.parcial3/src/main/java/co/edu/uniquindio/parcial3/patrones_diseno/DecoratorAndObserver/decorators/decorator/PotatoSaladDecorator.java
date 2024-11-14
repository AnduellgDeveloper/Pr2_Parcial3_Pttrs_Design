package co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.decorators.decorator;

import co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.decorators.service.ILunch;

public class PotatoSaladDecorator extends LunchDecorator {

    public PotatoSaladDecorator(ILunch iLunch) {
        super(iLunch);
    }
    @Override
    public double getCost(){
        return super.getCost() + 3000;
    }
    @Override
    public String getAdds() {
        return super.getAdds() + ", Ensalada de papas\n";
    }
}
