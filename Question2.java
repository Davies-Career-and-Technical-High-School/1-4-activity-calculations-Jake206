import java.util.Scanner;

class Question2 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

        System.out.println("Put a number that's an integer.");

        int x = scan.nextInt();

        x /= 12;

        System.out.println("In feet your number would turn into, " +x);



    }
}