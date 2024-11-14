package co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.decorator;

import co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.service.ILunch;

public class RiceDecorator extends LunchDecorator {

    public RiceDecorator(ILunch iLunch) {
        super(iLunch);
    }
    @Override
    public double getCost(){
        return super.getCost() + 2000;
    }
    @Override
    public String getAdds() {
        return super.getAdds() + ",Otra porcion de arroz\n";
    }
}
