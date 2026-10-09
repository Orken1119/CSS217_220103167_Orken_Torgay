package strategy.problem09;

public class Hero {
    private String name;
    private AttackStrategy weapon;

    public Hero(String name, AttackStrategy weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public void setWeapon(AttackStrategy weapon) {
        this.weapon = weapon;
    }

    public void performAttack() {
        if (weapon == null) {
            System.out.println(name + " has no weapon equipped!");
            return;
        }
        System.out.print(name + " attacks: ");
        weapon.attack();
    }
}
