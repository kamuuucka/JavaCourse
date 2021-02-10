public class Main {
    public static void main(String[] args){

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value: " + myMinFloatValue);
        System.out.println("Float maximum value: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value: " + myMinDoubleValue);
        System.out.println("Double maximum value: " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;       //hardly ever used
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("Int: " + myIntValue);
        System.out.println("Float: " + myFloatValue);
        System.out.println("Double: " + myDoubleValue);

        double pounds = 200d;
        double kilograms = 0.45359237d * pounds;
        System.out.println(pounds + " pounds = " + kilograms + " kilograms");

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);


    }
}
