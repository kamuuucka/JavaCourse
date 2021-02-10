public class Main {
    public static void main(String[] args) {
        numberToWords(78934500);
        System.out.println(reverse(-1234));
        System.out.println(getDigitCount(10));
    }

    // Printing each digit as a word
    private static void numberToWords(int number) {
        if (number < 0) System.out.println("Invalid Value");
        else {
            int count = getDigitCount(number);  //Counting digits to be sure, that 0s will be printed
            number = reverse(number);           //Reversing the number to print digits in the right order
            String word = "";
            String wholeNumber = "";
            System.out.println(count);
            for (int i = 0; i < count; i++) {
                int lastDigit = number % 10;
                switch (lastDigit) {
                    case 0:
                        word = "Zero";
                        break;
                    case 1:
                        word = "One";
                        break;
                    case 2:
                        word = "Two";
                        break;
                    case 3:
                        word = "Three";
                        break;
                    case 4:
                        word = "Four";
                        break;
                    case 5:
                        word = "Five";
                        break;
                    case 6:
                        word = "Six";
                        break;
                    case 7:
                        word = "Seven";
                        break;
                    case 8:
                        word = "Eight";
                        break;
                    case 9:
                        word = "Nine";
                        break;
                    default:
                        break;
                }
                wholeNumber = wholeNumber + word + " ";
                number /= 10;
            }
            System.out.println("Whole number: " + wholeNumber);
        }
    }

    //Reversing the number
    private static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reversedNumber *= 10;
            reversedNumber += lastDigit;
            number /= 10;
        }
        return reversedNumber;
    }

    //Counting digits in the number
    private static int getDigitCount(int number) {
        if (number < 0) return -1;
        else if (number == 0) return 1;
        else {
            int digitCount = 0;
            while (number != 0){
                number /= 10;
                digitCount ++;
            }
            return digitCount;
        }
    }
}
