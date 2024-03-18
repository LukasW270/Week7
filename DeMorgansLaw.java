import java.util.*;

public class DeMorgansLaw{
    public static void main(String[] args){

        System.out.println("This application has the purpose of illustrating DeMorgan's Laws.");
        System.out.println("DeMorgan's Laws state that !(a && b) == !a || !b, and that !(a || b) == !a && !b.");
        System.out.println("With this considered, DeMorgan's Laws states that !((a <= b) && (b > 10)) is equivalent to (a >= b) || (b < 10).");

        int a;
        int b;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer value for a: ");
        a = input.nextInt();

        System.out.print("Enter an integer value for b: ");
        b = input.nextInt();

        input.close();

        boolean valueA = !((a <= b) && (b > 10));
        boolean valueB = (a >= b) || (b < 10);

        System.out.println("!((a <= b) && (b > 10)) is " + valueA + ", and (a >= b) || (b < 10) is " + valueB + ".");
        System.out.println("Therefore, !((a <= b) && (b > 10)) is equivalent to (a >= b) || (b < 10).");

    }
}