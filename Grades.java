import java.util.*;

public class Grades {
    public static void main(String[] args){

        int grade;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your numeric grade: ");
        grade = input.nextInt();

        input.close();

        if (grade >= 97){
            System.out.println("You got an A+! Great job!");
        }
        else if (grade >= 93){
            System.out.println("Your letter grade is A. Very nice.");
        }
        else if (grade >= 90){
            System.out.println("That's an A-. That's good!");
        }
        else if (grade >= 87){
            System.out.println("Your grade is a B+. Still considered mastery.");
        }
        else if (grade >= 83){
            System.out.println("Your grade is a B. Decent.");
        }
        else if (grade >= 80){
            System.out.println("You got a B-. It could be improved.");
        }
        else if (grade >= 77){
            System.out.println("That's a C+. You could improve that.");
        }
        else if (grade >= 73){
            System.out.println("C. Could be better.");
        }
        else if (grade >= 70){
            System.out.println("C-. Not great.");
        }
        else if (grade >= 67){
            System.out.println("That's a D+. Almost failing.");
        }
        else if (grade >= 65){
            System.out.println("You got a D. Just passing; you should do beter.");
        }
        else if (grade >= 60){
            System.out.println("D-. You should get some more help.");
        }
        else {
            System.out.println("That's an F. The lowest letter grade.");
        }

    }
}
