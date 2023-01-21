package first;

public class Ship extends Vehicle implements IsSeaVessel{
    private int deadWeight;
    public Ship(int maxSpeed, String model, double price,int deadWeight) {
        super(maxSpeed, model, price);
        this.deadWeight=deadWeight;
    }

    @Override
    public double checkPromo(double price, double percentage) {
        return price-price*(0.3) ;
    }

    @Override
    public void enterSea() {
        System.out.printf("%s with %d and with price %.2f and with deadWeight %d entered the Land%n",getModel(),getMaxSpeed(),getPrice(),deadWeight);
    }
}
