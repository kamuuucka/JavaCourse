public class Main {
    public static void main(String[] args) {

        /*
        Player player = new Player();

        player.fullName = "Kama";
        player.health = 20;
        player.weapon = "Axe";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 12;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());
        */

        EnhancedPlayer player = new EnhancedPlayer("Kama", 20,"Axe");
        System.out.println("Initial health is " + player.getHitPoints());
    }
}
