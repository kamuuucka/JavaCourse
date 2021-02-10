public class Main {
    public static void main(String[] args){
        printSquareStar(8);
    }
    private static void printSquareStar(int number){
        if (number < 5) System.out.println("Invalid Value");
        else {
            int rowCount = number-2;
            for (int y = 0; y < number; y++){
                for (int x = 0; x < number; x++){
                    if (y == 0 || y == number - 1 || x == 0 || x == number -1 ||
                        x == y || rowCount - y + 1 == x)
                        System.out.print("o");
                    else System.out.print("x");
                }
                System.out.println();
            }
        }
    }
}
