import java.io.IOException;
public class ThrowsTest3
{
    static void display() throws IOException
    {
      System.out.println("Hello Java");
      throw new IOException();
    }
    public static void main(String args[])
    {
        ThrowsTest3 obj=new ThrowsTest3();
        try{
            obj.display
        }
        catch(IOException e)
        {
            System.out.println("Caught an exception: \n" +e);
        }
    }
}