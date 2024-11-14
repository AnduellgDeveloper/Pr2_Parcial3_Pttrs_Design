package co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.decorator;

import co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.service.ILunch;

public class SoupDecorator extends LunchDecorator {

    public SoupDecorator(ILunch iLunch) {
        super(iLunch);
    }
    @Override
    public double getCost(){
        return super.getCost() + 2000;
    }
    @Override
    public String getAdds() {
        return super.getAdds() + ", Sopa sencilla\n";
    }

}
