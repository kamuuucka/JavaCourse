public class Main {
    public static void main(String[] args){
        int result = 3; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);

        result -= 1;    // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        result *= 10;
        System.out.println("2 * 10 = " + result);
        result /= 5;
        System.out.println("20 / 5 = " + result);
        result %= 3;    // 4 % 3 = 1 How many 3s are in the 4.
        System.out.println("4 % 3 = " + result);

        boolean isAlien = false;
        if (!isAlien) System.out.println("It is not an alien!"); //if isAlien == false

        int topScore = 100;
        if (topScore == 100) System.out.println("You got the high score!");

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less than 100");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("Either or both of the conditions are true");

        boolean isCar = false;
        if (isCar) System.out.println("This is a car");

        boolean wasCar = isCar ? true : false; //first condition if isCar was true, second - if isCar was false
        if (wasCar) System.out.println("wasCar is true");

        double firstDoubleValue = 20.00d;
        double secondDoubleValue = 80.00d;
        double valuesTotal = (firstDoubleValue + secondDoubleValue) * 100.00d;
        double theRemainder = valuesTotal % 40.00d;
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println(isNoRemainder);
        if(!isNoRemainder) System.out.println("Got some remainder!");
    }
}
