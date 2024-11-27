import java.util.Scanner;

class main{
    public static void main(String args[])
    {
        char a;
        double number1,number2,result;
        Scanner input=new Scanner(System.in);
        System.out.println("Choose an operator:+,-,*,or /");
        a=input.next().charAt(0);

        System.out.println("Enter your  first number");
        number1=input.nextDouble();

        System.out.println("Enter your Second number");
        number2=input.nextDouble();

        switch(a)
        {
            case'+':
            result=number1 + number2;
            System.out.println(number1+"+" +number2 +"=" +result);
            break;

             case'-':
            result=number1 - number2;
            System.out.println(number1+"-" +number2 + "=" +result);
            break;

             case'*':
            result=number1 * number2;
            System.out.println(number1+"*" +number2 +"=" +result);
            break;

             case'/':
            result=number1 / number2;
            System.out.println(number1+"/" +number2 +"=" +result);
            break;

            default:
                System.out.println("Invalid operation");
                break;

        }
    }
}