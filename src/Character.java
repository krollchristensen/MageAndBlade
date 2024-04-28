abstract class Character implements Movable, Attackable {
    protected String name;
    protected int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    // Movable
    public void move() {
        System.out.println(name + " moves around the battlefield.");
    }

    // Viser karakterens status
    public void displayHealth() {
        System.out.println(name + " has " + health + " health remaining.");
    }

    // Standard angreb (kan overskrives)
    public void attack(Character target) {
        System.out.println(name + " attacks " + target.name + " with a basic attack!");
    }

    // Reducer målets helbred
    protected void decreaseHealth(int amount) {
        health -= amount;
        System.out.println(name + " takes " + amount + " damage!");
    }
}
