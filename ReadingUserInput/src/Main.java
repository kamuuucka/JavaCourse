import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scan.hasNextInt();
        if (hasNextInt){
            int yearOfBirth = scan.nextInt();
            scan.nextLine(); //handle next line character (enter key)

            System.out.println("Enter your name: ");
            String name = scan.nextLine();

            int age = 2020 - yearOfBirth;

            if(age >= 0 && age <= 100)
                System.out.println("Your name is " + name + " and you are " + age + " years old");
            else
                System.out.println("Invalid year of birth");
        } else
            System.out.println("Unable to parse year of birth");

        scan.close();
    }
}
