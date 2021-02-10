import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumOfNumbers = 0;
        int counter = 0;
        System.out.println("Write ten numbers. After each one hit enter!");
        while (counter != 10) {
            System.out.println("Enter number #" + (counter+1) + ":");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                sumOfNumbers += number;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
            counter ++;
        }
        System.out.println(sumOfNumbers);
        scanner.close();
    }
}
