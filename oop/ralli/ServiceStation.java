package ralli;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation<T extends Car, R extends Truck> {

    private String nameStation;
    private Queue<T> queue = new LinkedList<>();
    private Queue<R> queue1 = new LinkedList<>();

    public ServiceStation(String nameStation) {
        this.nameStation = nameStation;
    }

    public void addAuto(T car) {
        queue.offer(car);
    }

    public void addAuto(R truck) {
        queue1.offer(truck);
    }

    public void doVehicleInspection() {
        T auto = queue.poll();
        if (auto != null) {
            System.out.println("Автомобиль " + auto.getBrand() + " " + auto.getModel() + " прошел техосмотр");
            doVehicleInspection();
        }
        R truck = queue1.poll();
        if (truck != null) {
            System.out.println("Грузовик " + truck.getBrand() + " " + truck.getModel() + " прошел техосмотр");
            doVehicleInspection();
        } else {
            System.out.println("Все машины, участвующие в заезде прошли техосмотр");
        }

    }
}
