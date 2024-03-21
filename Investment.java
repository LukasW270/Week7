import java.util.*;
import java.lang.Math;

public class Investment {
    public static void main(String[] args){

    double initial;
    double total;
    double rate;
    double timesCompounded;
    double years;

    Scanner input = new Scanner(System.in);

    System.out.print("What was your initial investment? ");
    initial = input.nextDouble();

    System.out.print("How many times was your investment compounded each year? ");
    timesCompounded = input.nextDouble();

    System.out.print("At what rate? ");
    rate = input.nextDouble();

    System.out.print("What is the final amount? ");
    total = input.nextDouble();

    input.close();

    years = ((Math.log(total/initial)/(Math.log(1 + (rate/timesCompounded))))) * (1/timesCompounded);

    System.out.println("Your initial investment of " + initial + " will take " + years + " to be worth at least " + total + " if compounded " + timesCompounded + " per year at " + rate + " .");

    }
}
