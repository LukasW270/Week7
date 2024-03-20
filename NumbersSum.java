import java.util.*;

public class NumbersSum {
    public static void main(String[] args){

        int startNumber = 1;
        int number;
        int numberSum = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextInt();

        input.close();

        while (number >= startNumber){
            System.out.println(startNumber);
            numberSum += startNumber;
            startNumber++;
        }

        System.out.println("The sum of the numbers is " + numberSum + ".");

    }
}