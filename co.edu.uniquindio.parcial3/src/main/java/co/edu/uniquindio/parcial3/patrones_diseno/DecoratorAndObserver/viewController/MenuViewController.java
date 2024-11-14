package co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.viewController;

import co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.decorators.model.SimpleLunch;
import co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.decorators.decorator.*;
import co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.decorators.model.KitchenObserver;
import co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.decorators.service.ILunch;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

public class MenuViewController {
        private ILunch lunch;
        private KitchenObserver kitchen;

        @FXML
        private Button addOrder;
        @FXML
        private Button calculate;
        @FXML
        private CheckBox chkBean;
        @FXML
        private CheckBox chkDisposables;
        @FXML
        private CheckBox chkMangoJuice;
        @FXML
        private CheckBox chkPotatoSalad;
        @FXML
        private CheckBox chkRice;
        @FXML
        private CheckBox chkSalad;
        @FXML
        private CheckBox chkSoup;
        @FXML
        private CheckBox chkSoursopJuice;
        @FXML
        private Text txtCost;
        @FXML
        private TextArea txtAdds;
        @FXML
        private Text txtUtils;


        public void SetKitchenObserver(KitchenObserver kitchen) {
            this.kitchen = kitchen;
        }

        @FXML
        private void onAddOrder() {
            String order = txtAdds.getText();
            if (!order.isEmpty()) {
                kitchen.addOrder(order);
                txtAdds.clear();
                System.out.println("Orden pedida: " + order);
            } else {
                System.out.println("El campo del pedido no puede estar vacia.");
            }
        }

        @FXML
        private void onCancellOrder() {
            String order = txtAdds.getText();
            if (!order.isEmpty()) {
                boolean cancell = kitchen.cancellOrder(order);
                txtAdds.clear();
                if (cancell) {
                    System.out.println("Orden cancelada: " + order);
                } else {
                    System.out.println("La orden no se encontro en los pedidos: " + order);
                }
            } else {
                System.out.println("El campo de la orden no puede estar vacio");
            }
        }

        @FXML
        public void initialize() {
            lunch = new SimpleLunch();
            updateDisplay();
        }

        @FXML
        void onCalculate(ActionEvent event) {
            lunch = new SimpleLunch();
            if (chkBean.isSelected()) {
                lunch = new BeanDecorator(lunch);
            }
            if (chkDisposables.isSelected()) {
                lunch = new DisposableDecorator(lunch);
            }
            if (chkMangoJuice.isSelected()) {
                lunch = new MangoJuiceDecorator(lunch);
            }
            if (chkPotatoSalad.isSelected()) {
                lunch = new PotatoSaladDecorator(lunch);
            }
            if (chkRice.isSelected()) {
                lunch = new RiceDecorator(lunch);
            }
            if (chkSalad.isSelected()) {
                lunch = new SaladDecorator(lunch);
            }
            if (chkSoup.isSelected()) {
                lunch = new SoupDecorator(lunch);
            }
            if (chkSoursopJuice.isSelected()) {
                lunch = new SoursopJuiceDecorator(lunch);
            }

            updateDisplay();
        }

        private void updateDisplay() {
            txtCost.setText(String.format("Costo: $%.2f", lunch.getCost()));
            txtAdds.setText("Adiciones: " + lunch.getAdds());
            txtUtils.setText("Desechables: " + lunch.getUtils());
        }
}
