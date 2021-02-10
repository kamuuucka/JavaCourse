public class Main {
    public static void main(String[] args){
        canPack(2,1,5);
    }
    private static boolean canPack(int bigCount, int smallCount, int goal){
        bigCount *= 5;
        if (bigCount + smallCount < goal || bigCount < 0 || smallCount < 0 || goal < 0) {
            System.out.println("false");
            return false;
        }
        else{
            if (bigCount > goal) {
                System.out.println(bigCount);
                System.out.println("false");
                return false;
            }
            else {
                System.out.println("true");
                return true;
            }
        }
    }
}
