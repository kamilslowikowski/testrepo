import java.util.Scanner;

public class CodingChallengeDoWhile {
    public static void main(String[] args) {
        int k=0;
        do {
            System.out.println("Please write 2 numbers you want to add.");
            System.out.println("Please enter first value:");
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            System.out.println("Please enter second value:");
            int y = scanner.nextInt();
            int z=x+y;
            System.out.println("The sum of the numbers is " + z);
            System.out.println("Do you want to start over? (enter 1 for 'yes', any other key for 'no')");
            k=scanner.nextInt();
        }while(k==1);
        {}
        System.out.println("Thank you and goodbye");
    }
}
