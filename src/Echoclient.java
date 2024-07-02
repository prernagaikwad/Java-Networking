import java.net.Socket;

public class Echoclient
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Client started");
            Socket soc = new Socket("localhost", 57275);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}
