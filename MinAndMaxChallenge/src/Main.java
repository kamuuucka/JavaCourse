import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maximum = 0;
        int minimum = 0;
        boolean first = true;
        int number;

        while (true){
            System.out.println("Enter number: ");
            boolean hasInt = scanner.hasNextInt();
            if (hasInt){
                number = scanner.nextInt();

                if(first){
                    first = false;
                    minimum = number;
                    maximum = number;
                }

                if (number > maximum ) {
                    maximum = number;
                }
                if (number < minimum ) {
                    minimum = number;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Maximum number is: " + maximum);
        System.out.println("Minimum number is: " + minimum);
    }
}
