package co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.decorators.decorator;

import co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.decorators.service.ILunch;

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
