package co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.decorators.decorator;

import co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.decorators.service.ILunch;

public class DisposableDecorator extends LunchDecorator {

    public DisposableDecorator(ILunch iLunch) {
        super(iLunch);
    }
    @Override
    public double getCost(){
        return super.getCost() + 1650;
    }
    @Override
    public String getAdds() {
        return super.getAdds() + ", Salsas en sobre\n";
    }
    @Override
    public String getUtils() {
        return super.getUtils() + ", Recipientes Desechables\n";
    }

}
