package strategy.problem09;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Aragorn", new MeleeSwordAttack());

        System.out.println("--- Melee Weapon Equipped ---");
        hero.performAttack();

        System.out.println("\n--- Switching to Ranged Weapon ---");
        hero.setWeapon(new RangedBowAttack());
        hero.performAttack();

        System.out.println("\n--- Switching to Magic Spell ---");
        hero.setWeapon(new MagicCastAttack());
        hero.performAttack();
    }
}
