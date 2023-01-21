package first;

public class Hovercraft extends Vehicle implements IsSeaVessel{

    private int passengersCount;
    public Hovercraft(int maxSpeed, String model, double price,int passengersCount) {
        super(maxSpeed, model, price);
        this. passengersCount=passengersCount;
    }

    @Override
    public double checkPromo(double price,double percentage) {
        return price-price*0.03;
    }

    @Override
    public void enterSea() {
        System.out.printf("%s with %d and with price %.2f and passengers %d entered the Sea%n",getModel(),getMaxSpeed(),getPrice(),passengersCount);
    }

}
