class Wizard extends Character implements Healable {
    private int mana;

    public Wizard(String name, int health, int mana) {
        super(name, health);
        this.mana = mana;
    }

    // Healable
    public void heal(int amount) {
        if (mana >= 10) {
            health += amount;
            mana -= 10;
            System.out.println(name + " uses magic to heal themselves for " + amount + " health.");
        } else {
            System.out.println(name + " does not have enough mana to heal.");
        }
    }

    // Angreb med besværgelse
    public void attack(Character target) {
        if (mana >= 20) {
            target.decreaseHealth(30);
            mana -= 20;
            System.out.println(name + " casts a powerful spell on " + target.name + "!");
        } else {
            super.attack(target); // Brug basis angreb hvis ikke nok mana
        }
    }
}
