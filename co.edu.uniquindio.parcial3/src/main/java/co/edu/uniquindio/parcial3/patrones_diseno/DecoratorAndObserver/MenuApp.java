package co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver;

import co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.model.KitchenObserver;
import co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.viewController.MenuViewController;
import co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.viewController.PedidoViewCorrientazos;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MenuApp extends Application {
    private KitchenObserver kitchen = new KitchenObserver();

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Cargar la ventana principal del cliente
        FXMLLoader mainLoader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/parcial3/patrones_diseno/MenuCorrientazos-view.fxml"));
        AnchorPane mainRoot = mainLoader.load();
        MenuViewController menu = mainLoader.getController();
        menu.SetKitchenObserver(kitchen);
        primaryStage.setTitle("Corrientazos la 25!");
        primaryStage.setScene(new Scene(mainRoot, 700, 600));
        primaryStage.setResizable(false);
        primaryStage.show();

        // Cargar la ventana de visualización de los pedidos

        FXMLLoader displayLoader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/parcial3/patrones_diseno/PedidoCorrientazos.fxml"));
        AnchorPane displayRoot = displayLoader.load();
        PedidoViewCorrientazos displayController = displayLoader.getController();
        displayController.setOrder(kitchen);
        Stage displayStage = new Stage();
        displayStage.setTitle("Pedidos Corrientazos la 25");
        displayStage.setScene(new Scene(displayRoot, 600, 400));
        displayStage.setResizable(false);
        displayStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
