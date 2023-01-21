import java.io.*;
import java.net.Socket;

import java.util.Random;
import java.util.Scanner;

public class Client {

    public static void main(String args[])throws Exception {
        Socket s = null;
        Scanner scanner = new Scanner(System.in);
        PrintStream out = null;

        Random rand = new Random();
        int upperbound = 100;
        while (true) {
            try {
                s = new Socket("localhost", 3333);
                out = new PrintStream(s.getOutputStream());

                int int_random = rand.nextInt(upperbound);
                Customers customers = new Customers(int_random);

                System.out.println("Write a message:");
                String message = scanner.nextLine();
                out.println("Customer with client number (" + customers.getClientNumber() + ")" + " :" + message);



        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if (out != null) {
                out.close();
            }
        }
    }
    }

}
