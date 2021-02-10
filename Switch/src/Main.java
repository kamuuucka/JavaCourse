public class Main {
    public static void main(String[] args){
        int value = 1;
        if(value == 1)
            System.out.println("Value was 1");
        else if (value == 2)
            System.out.println("Value was 2");
        else
            System.out.println("Was not 1 or 2");

        int switchValue = 3;
        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3 or a, 4 or a 5");
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char charForSwitch = 'A';

        switch (charForSwitch){
            case 'A':
                System.out.println("A found");
                break;
            case 'B':
                System.out.println("B found");
                break;
            case 'C':
                System.out.println("C found");
                break;
            case 'D':
                System.out.println("D found");
                break;
            case 'E':
                System.out.println("E found");
                break;
            default:
                System.out.println("A, B, C, D, E not found");
                break;
        }

        String month = "JANUARy";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Me don't know");
                break;
        }


    }


}
