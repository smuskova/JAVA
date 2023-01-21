public class Customers extends Thread{

    private int clientNumber;

    public Customers(int clientNumber) {
        this.clientNumber = clientNumber;
    }
    public int getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(int clientNumber) {
        this.clientNumber = clientNumber;
    }

    public void run()
    {

    }


}
