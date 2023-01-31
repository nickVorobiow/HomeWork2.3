package transport;

public class Bus extends Transport {

    public Bus(String brand, String model, String engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMove() {
        System.out.println("Bus starts moving...");
    }
    @Override
    public void stopMove() {
        System.out.println("Bus stops moving...");
    }

    @Override
    public String toString() {
        return "Bus{" +
                super.toString() +
                '}';
    }
}
