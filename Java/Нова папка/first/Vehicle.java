package first;

public abstract class Vehicle {
    public Vehicle(int maxSpeed, String model, double price) {
        this.maxSpeed = maxSpeed;
        this.model = model;
        this.price = price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //за максимална скорост (махspeed), модел (model) и цена (price)
    private int maxSpeed;
    private String model;
    private double price;

    public abstract double checkPromo(double price,double percentage);

}
