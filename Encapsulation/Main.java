package Encapsulation;

public class Main {
    public static void main(String[] args) {
        // Player player = new Player();
        // player.name = "John";
        // player.health = 20;
        // player.weapon = "Sword";

        // int damage = 10;
        // player.loseHealth(damage);
        // System.out.println("Remaining Health " + player.healthRemaining());

        // damage = 11;
        // player.loseHealth(damage);
        // System.out.println("Remainig Health " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("John", 50, "Sword");
        System.out.println("Initial health is " + player.getHealth());
    }
}