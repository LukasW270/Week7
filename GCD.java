import java.util.*;

public class GCD {
    public static void main(String[] args){

        int num1; int num2; int between;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        num1 = input.nextInt();

        System.out.print("Enter a second non-negative integer: ");
        num2 = input.nextInt();

        input.close();

        while (num2 > 0){
            between = num1 % num2;
            num1 = num2;
            num2 = between;
        }

        System.out.println("The GCD is " + num1 + ".");

    }
}
