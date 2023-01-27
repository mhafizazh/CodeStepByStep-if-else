/*The following code has many problems. First, it has a few syntax errors; find and fix them.

Second, it has a logic problem: for some value(s), it prints the wrong answer. Find any logic problems and fix them.

Lastly, the program uses if and else in a clumsy way. Improve the style of the code to be more elegant and avoid redundancy.

public class AgeCheck {
    public static void main(String[] args) {
        System.out.print("Your age? ");
        Scanner console = new Scanner(System.in);
        int myAge = console.nextInt();
        message(myAge);
    }

    // Displays message about driving to user based on given age
    public static void message(int age) {
        if (myAge >= 16) {
            System.out.println("I'm old enough to drive!");
        }
        if (myAge <= 16) {
            System.out.println("Not old enough yet... :*(");
        }
    }
}


 */
import java.util.Scanner;
public class AgeCheck {
    public static void main(String[] args) {

        System.out.print("Your age? ");
        Scanner console = new Scanner(System.in);
        int myAge = console.nextInt();
        message(myAge);
    }

    // Displays message about driving to user based on given age
    public static void message(int age) {
        if (age >= 16) {
            System.out.println("I'm old enough to drive!");
        } else {
            System.out.println("Not old enough yet... :*(");
        }
    }
}

