package co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.decorator;

import co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.service.ILunch;

public class BeanDecorator extends LunchDecorator {

    public BeanDecorator(ILunch iLunch) {
        super(iLunch);
    }
    @Override
    public double getCost(){
        return super.getCost() + 3500;
    }
    @Override
    public String getAdds() {
        return super.getAdds() + ", Tazón de Frijoles\n";
    }
}
