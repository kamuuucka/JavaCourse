public class Main {
    public static void main(String[] args){
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is: " + newScore);
        calculateScore(75);
        calculateScore();
        double centimeters = calcFeetAndInchesToCentimeters(0,1);

        calcFeetAndInchesToCentimeters(100);
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " +score + " points" );
        return score * 1000;
    }
    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " +score + " points" );
        return score * 1000;
    }
    public static int calculateScore(){
        System.out.println("No player name, no player score");
        return 0;
    }

    private static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet < 0 || inches < 0 || inches > 12) {
            System.out.println("Invalid Number");
            return -1;
        }
        else {
            double centimeters = (inches + (feet * 12)) * 2.54d;
            System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
            return centimeters;
        }
    }

    private static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0) return -1;
        else {
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
            return calcFeetAndInchesToCentimeters(feet,remainingInches);
        }
    }
}
