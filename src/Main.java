public class Main {
    public static void main(String[] args) {

        Wizard wizard = new Wizard("Merlin", 100, 50);
        Warrior warrior = new Warrior("Conan", 150, 25);

        wizard.move();
        warrior.move();
        wizard.attack(warrior);
        warrior.attack(wizard);
        wizard.heal(20);
        wizard.displayHealth();
        warrior.displayHealth();
    }
}