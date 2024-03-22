import java.util.*;
import java.lang.Math;
import java.text.NumberFormat;

public class Investment {
    public static void main(String[] args){

    NumberFormat money = NumberFormat.getCurrencyInstance();
    NumberFormat decimal = NumberFormat.getNumberInstance();
    NumberFormat number = NumberFormat.getIntegerInstance();

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

    System.out.println("Your initial investment of " + money.format(initial) + " will take " + decimal.format(years) + " years to be worth at least " + money.format(total) + " if compounded " + number.format(timesCompounded) + " time per year at " + rate*100 + "%.");

    }
}
