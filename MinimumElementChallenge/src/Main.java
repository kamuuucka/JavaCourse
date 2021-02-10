import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many elements you want to add?");
        int count = scanner.nextInt();
        int[] array = readIntegers(count);
        int minValue = findMin(array);
        System.out.println(minValue);
    }

    private static int[] readIntegers(int count){
        int[] usersIntegers = new int[count];
        for (int i = 0; i < usersIntegers.length;i++){
            System.out.println("Add element #" + (i+1) + ":");
            if(scanner.hasNextInt())
                usersIntegers[i] = scanner.nextInt();
            else {
                System.out.println("That's not a number!");
                return null;
            }
        }
        return usersIntegers;
    }

    private static int findMin(int[] array){
        int minValue;
        int[] sortedArray = new int[array.length];
        for(int i = 0; i<array.length;i++){
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for(int i = 0; i < sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        minValue = sortedArray[sortedArray.length-1];
        return minValue;
    }
}
