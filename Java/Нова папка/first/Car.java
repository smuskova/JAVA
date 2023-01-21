package first;

public class Car extends Vehicle implements IsLandVehicle{

    private int kW;
    private final static double PERCENTAGE=0.2;
    public Car(int maxSpeed, String model, double price,int kW) {
        super(maxSpeed, model, price);
        this.kW=kW;
    }


    @Override
    public void enterLand() {
        System.out.printf("%s with %d and with price %.2f and kW %d entered the Land%n",getModel(),getMaxSpeed(),getPrice(),kW);
    }

    @Override
    public double checkPromo(double price, double percentage) {
       return price-price*0.2;
    }
}
