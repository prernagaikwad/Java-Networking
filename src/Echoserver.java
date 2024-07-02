import java.net.ServerSocket;
import java.net.Socket;

public class Echoserver
{
    public static void main(String[] args)
    {
        try {

            System.out.println("Waiting for clients...");
            ServerSocket ss = new ServerSocket(57275);
            Socket soc = ss.accept();
            System.out.println("Connection established");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
