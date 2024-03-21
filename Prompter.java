import java.util.*;

public class Prompter {
    public static void main(String[] args){

        int min; int max; int mid;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the minimum value: ");
        min = input.nextInt();

        System.out.print("Enter the maximum value: ");
        max = input.nextInt();

        System.out.print("Enter a number between " + min + " and " + max + ": ");
        mid = input.nextInt();

        while (!(mid > min && mid < max)){
            System.out.print("Enter a number between " + min + " and " + max + ": ");
            mid = input.nextInt();
        }

        input.close();

        System.out.println("Finally! You chose a number between the max and min.");

    }
}
