package co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.decorators.decorator;

import co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.decorators.service.ILunch;

public class SoursopJuiceDecorator extends LunchDecorator {

    public SoursopJuiceDecorator(ILunch iLunch) {
        super(iLunch);
    }
    @Override
    public double getCost(){
        return super.getCost() + 1500;
    }
    @Override
    public String getAdds() {
        return super.getAdds() + ", Jugo de Guanabana\n";
    }
}
