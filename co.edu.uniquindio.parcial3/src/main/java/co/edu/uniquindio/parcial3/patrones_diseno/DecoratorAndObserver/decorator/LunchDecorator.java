package co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.decorator;

import co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.service.ILunch;

public abstract class LunchDecorator implements ILunch {
    protected ILunch decoratedLunch;

    public LunchDecorator(ILunch iLunch) {
        this.decoratedLunch = iLunch;
    }

    @Override
    public double getCost() {
        return decoratedLunch.getCost();
    }

    @Override
    public String getAdds() {
        return decoratedLunch.getAdds();
    }

    @Override
    public String getUtils() {
        return decoratedLunch.getUtils();
    }
}
