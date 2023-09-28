import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age;
        System.out.print("Please enter your age here:");
        age = scan.nextInt();
        if (age >= 21) {
            System.out.println("You get a paper wristband!");
        }
        else if(age < 0) {
            System.out.println("You have entered an invalid age");
            System.exit(0);
        }
        else {
            System.out.println("You do not receive a paper wristband!");
        }

    }
}