import java.util.*;

public class Starpattern{
    public static void main(String args[]) 
    {
       
       
      int n= 10;
        for(int line=1; line<=n; line++) {
            for(int star=1; star<=line; star++) {
            System.out.print(star);
        }
        System.out.println();
    }
}
} 