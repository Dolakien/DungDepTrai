
import java.util.Scanner;

public class applyExceptionHandling {

    public static int InputNumber() {
        int number = 0;
        Scanner sc = new Scanner(System.in);
        number = Integer.parseInt(sc.nextLine());
        return number;

    }

    public static void main(String[] args) {
        int number = 0;
        int sum = 0;
        System.out.println("Enter an integer number, press 0 to stop: ");
        do {
            try {
                number = InputNumber();
                sum += number;

            } catch (Exception e) {
                System.out.println("Data invalid, please try again!");
            }

        } while (number != 0);
        System.out.println("Sum = " + sum);

    }

}
