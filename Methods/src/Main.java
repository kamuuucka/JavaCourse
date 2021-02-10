public class Main {
    public static void main(String[] args){
        int score;
        String playerName;
        int position;

        score = 1500;
        playerName = "kama123";
        position = calculateHighScorePosition(score);
        displayHighScorePosition(playerName, position);

        score = 900;
        playerName = "mati098";
        position = calculateHighScorePosition(score);
        displayHighScorePosition(playerName, position);

        score = 400;
        playerName = "kacpur456";
        position = calculateHighScorePosition(score);
        displayHighScorePosition(playerName, position);

        score = 1000;
        playerName = "dawidełek345";
        position = calculateHighScorePosition(score);
        displayHighScorePosition(playerName, position);




    }

    private static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    private static int calculateHighScorePosition(int score){
        if (score >= 1000) return 1;
        else if (score >= 500 && score < 1000) return 2;
        else if (score >= 100 && score < 500) return 3;
        else return 4;
    }
}
