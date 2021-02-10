public class Main {
    public static void main(String[] args){
        String myString = "This is a string";
        System.out.println("myString is equal to: " + myString);
        myString = myString + ", and this is more.";
        System.out.println("Now, myString is equal to: " + myString);
        myString = myString + " \u00A9 2020";
        System.out.println("And now, myString is equal to: " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.99";
        System.out.println(numberString);

        String lastString = "10"; //when we add int to the string, it converts to the String type
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString is equal to: " + lastString);
    }
}
