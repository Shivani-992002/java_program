import java.util.*;

public class Hollowrect
{
    public static void pattern(int totRows, int totCols)
    {
    for(int i=1; i<=totRows;i++){
        //innner columns
        for(int j=1; j<=totCols; j++){
            //cell - (i,j)
            if(i== 1||i == totRows || j ==1 || j==totCols){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

    public static void main(String args[]) {
        pattern(5,4);
        }
}