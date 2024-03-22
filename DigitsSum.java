import java.util.*;

public class DigitsSum {
    public static void main(String[] args){

        int integer;
        int remainder;
        int integerSum = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        integer = input.nextInt();

        input.close();

        while (integer != 0){

            remainder = integer%10;
            integerSum += remainder;
            integer = (integer - (integer%10))/10;
            
        }

        System.out.println("The sum of the digits is: " + integerSum);

    }
}
