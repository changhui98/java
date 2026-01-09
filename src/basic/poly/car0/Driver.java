package basic.poly.car0;

public class Driver {

    private K3Car k3car;

    public void setK3Car(K3Car k3car) {
        this.k3car = k3car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        k3car.startEngine();
        k3car.pressAccelerator();
        k3car.offEngine();
    }
}
