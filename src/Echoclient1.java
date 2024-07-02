import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Echoclient1
{
    public static void main(String[] args)
    {
      try
      {
          System.out.println("Client started ");
          Socket soc=new Socket("localhost",57275);
          BufferedReader userInput =  new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter a String");
          String str = userInput.readLine();
          PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
          System.out.println(str);
      }
       catch(Exception e)
       {
           e.printStackTrace();
       }
    }

}
