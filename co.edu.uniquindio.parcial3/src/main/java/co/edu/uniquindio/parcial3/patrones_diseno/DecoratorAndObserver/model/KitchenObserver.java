package co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.model;

import co.edu.uniquindio.parcial3.patrones_diseno.DecoratorAndObserver.service.IObserver;

import java.util.ArrayList;
import java.util.List;

public class KitchenObserver {
    private List<IObserver> Observers = new ArrayList<>();
    private List<String> inventory = new ArrayList<>();

    public KitchenObserver() {
        initializeTestData();
    }
    public void addObserver(IObserver observer) {
        Observers.add(observer);
    }

    public void removeObserver(IObserver observer) {
        Observers.remove(observer);
    }

    private void notifyObservers() {
        for (IObserver observer : Observers) {
            observer.update();
        }
    }

    public void addOrder(String order) {
        if (!inventory.contains(order)) {
            inventory.add(order);
            notifyObservers();
            System.out.println("Orden de almuerzo añadida: " + order);
        } else {
            System.out.println("El almuerzo se ha añadido a la lista de pedidos: " + order);
        }
    }

    public boolean cancellOrder(String order) {
        boolean cancel = inventory.remove(order);
        if (cancel) {
            notifyObservers();
            System.out.println("Orden cancelada: " + order);
        } else {
            System.out.println("La orden no está en la lista de pedidos: " + order);
        }
        return cancel;
    }

    private void initializeTestData() {
        inventory.add("Bandeja super corriente\n," +
                "Ensalada de papas ");
        inventory.add("Bandeja super corriente\n," +
                " Jugo de mango\n," +
                " más otra porcion de arroz\n," +
                " frijoles\n");
        notifyObservers();
    }
    public List<String> getInventory() {
        return inventory;
    }
}
