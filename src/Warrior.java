class Warrior extends Character {
    private int strength;

    public Warrior(String name, int health, int strength) {
        super(name, health);
        this.strength = strength;
    }

    // Stærkere angreb end standard
    public void attack(Character target) {
        target.decreaseHealth(strength);
        System.out.println(name + " swings a heavy sword at " + target.name + " dealing " + strength + " damage!");
    }
}
