module co.edu.uniquindio.parcial3.patrones_diseno {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.parcial3.patrones_diseno.Facade to javafx.fxml;
    exports co.edu.uniquindio.parcial3.patrones_diseno.Facade;
    opens co.edu.uniquindio.parcial3.patrones_diseno.Facade.viewController;
    exports co.edu.uniquindio.parcial3.patrones_diseno.Facade.viewController;

    opens co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver;
    exports co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver;
    opens co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.viewController;
    exports co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.viewController;
    exports co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.decorators.model;
    opens co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.decorators.model;
    exports co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.decorators.decorator;
    opens co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.decorators.decorator;


}