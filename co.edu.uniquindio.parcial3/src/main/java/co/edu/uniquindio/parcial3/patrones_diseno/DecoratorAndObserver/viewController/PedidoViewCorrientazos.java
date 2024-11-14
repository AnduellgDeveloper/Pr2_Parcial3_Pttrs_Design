package co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.viewController;

import co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.decorators.model.KitchenObserver;
import co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.decorators.service.IObserver;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class PedidoViewCorrientazos implements IObserver {
    private KitchenObserver kitchen;

    @FXML
    private ListView<String> ListOrder;
    private ObservableList<String> observableOrders = FXCollections.observableArrayList();

    public void setOrder(KitchenObserver kitchen) {
        this.kitchen = kitchen;
        if (this.kitchen != null) {
            this.kitchen.addObserver(this);
            update();
        }
    }

    @Override
    public void update() {
        if (kitchen != null) {
            observableOrders.clear();
            observableOrders.addAll(kitchen.getInventory());
            ListOrder.setItems(observableOrders);
        }
    }
}



