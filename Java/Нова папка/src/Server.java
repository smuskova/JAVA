import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    private final static String READY_MESSAGES="\\C:\\Users\\ayape\\Desktop\\ready.txt";
    private ServerSocket server;
    private Socket socket;
    Scanner scanner=new Scanner(System.in);
    public void start(){
        try {
            server=new ServerSocket(3333);

            Scanner sc=null;

            while (true){
                Socket client=server.accept();
                try{
                    sc=new Scanner(client.getInputStream());

                    String message=sc.nextLine();
                    System.out.println(message);

                    System.out.println("Does anybody wnat to deal with that message : Y/N" );
                    String msg=scanner.nextLine();
                    if(msg.equalsIgnoreCase("Y")){
                        System.out.println("Enter userName: ");
                        String name=scanner.nextLine();
                        Support support=new Support(name);
                        System.out.println("Support with userName : "+support.getUserNames()+" is dealing with the message");
                        System.out.println("message is solved" );
                        try(FileWriter writer=new FileWriter(READY_MESSAGES,true)){
                            writer.write(message+"\n");
                        }
                    }else{
                        System.out.println("Okay,no one wants");
                        continue;
                    }
                }catch (IOException e){
                    e.printStackTrace();
                }finally {
                    if(sc!=null){
                        sc.close();
                    }
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
