module co.edu.uniquindio.parcial3.patrones_diseno {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.parcial3.patrones_diseno to javafx.fxml;
    exports co.edu.uniquindio.parcial3.patrones_diseno;
    opens co.edu.uniquindio.parcial3.patrones_diseno.Facade;
    exports co.edu.uniquindio.parcial3.patrones_diseno.Facade;
    opens co.edu.uniquindio.parcial3.patrones_diseno.Facade.viewController;
    exports co.edu.uniquindio.parcial3.patrones_diseno.Facade.viewController;

}