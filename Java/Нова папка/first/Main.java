package first;

public class Main {
    public static void main(String[] args) {
        Car car=new Car(170,"Q7",15.000,380);
        System.out.println("Car with check promo "+car.checkPromo(car.getPrice(), 0.2));
        car.enterLand();
        Hovercraft hovercraft=new Hovercraft(270,"HHGJ",7.000,4);
        System.out.println("Hovercraft with check promo "+hovercraft.checkPromo(hovercraft.getPrice(), 0.03));
        hovercraft.enterSea();
        Ship ship=new Ship(100,"Kibg",100.000,7000);
        System.out.println("Ship with check promo "+ship.checkPromo(ship.getPrice(),0.3));
        ship.enterSea();
    }
}
