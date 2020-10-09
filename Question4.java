import java.util.Scanner;

class Question4 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

        System.out.println("Enter a price: ");

        double x = scan.nextDouble();
        x -= 20;

        System.out.println("Change from $20: " + "$"+ x);



    }
}