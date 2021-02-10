public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args){
        System.out.println(getDurationString(345,57));
        System.out.println(getDurationString(4582));
    }

    private static String getDurationString(int minutes, int seconds){
        if (minutes < 0 || seconds < 0 || seconds > 59) return INVALID_VALUE_MESSAGE;

        int minutesToHours = minutes / 60;
        int remainingMinutes = minutes % 60;
        //  Tim's solution
        /*
        String hoursString = minutesToHours + "h";
        if (minutesToHours < 10) hoursString = "0" + hoursString;

        String minutesString = remainingMinutes + "m";
        if (remainingMinutes < 10) minutesString = "0" + minutesString;

        String secondsString = seconds + "s";
        if (seconds < 10) secondsString = "0" + secondsString;

        return hoursString + " " + minutesString + " " + secondsString;

         */
        if (minutesToHours < 10){
            if (remainingMinutes < 10){
                if (seconds < 10)
                    return "0" + minutesToHours + "h 0" + remainingMinutes + "m 0" + seconds + "s";
                else return "0" + minutesToHours + "h 0" + remainingMinutes + "m " + seconds + "s";
            }
            return "0" + minutesToHours + "h " + remainingMinutes + "m " + seconds + "s";
        }
        return minutesToHours + "h " + remainingMinutes + "m " + seconds + "s";
    }

    private static String getDurationString(int seconds){
        if (seconds < 0) return INVALID_VALUE_MESSAGE;
        else {
            int secondsToMinutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            return getDurationString(secondsToMinutes, remainingSeconds);
        }
    }
}
