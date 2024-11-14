package co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.decorators.decorator;

import co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.decorators.service.ILunch;

public class MangoJuiceDecorator extends LunchDecorator {

    public MangoJuiceDecorator(ILunch iLunch) {
        super(iLunch);
    }
    @Override
    public double getCost(){
        return super.getCost() + 2000;
    }
    @Override
    public String getAdds() {
        return super.getAdds() + ", Jugo de Mango\n";
    }
}
