module co.edu.uniquindio.parcial3.patrones_diseno {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.parcial3.patrones_diseno to javafx.fxml;
    exports co.edu.uniquindio.parcial3.patrones_diseno;
}