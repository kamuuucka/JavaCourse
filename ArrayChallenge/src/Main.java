import java.util.Scanner;

public class Main {
    private static int[] usersIntegers;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many elements would you like to add to this array:");
        int arrayLength = scanner.nextInt();
        getIntegers(arrayLength);
        printArray(usersIntegers);
        System.out.println("Sorted array: ");
        int[] sorted = sortIntegers(usersIntegers);
        printArray(sorted);
    }

    private static int[] getIntegers(int number){
        usersIntegers = new int[number];
        for (int i = 0; i < number; i++){
            System.out.println("Adding " + (i+1) + " element:");
            usersIntegers[i] = scanner.nextInt();
        }
        return usersIntegers;
    }

    private static void printArray(int[] array){
        for(int i = 0; i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    private static int[] sortIntegers(int[] array){
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
        return sortedArray;
    }
}
