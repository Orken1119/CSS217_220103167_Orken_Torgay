package strategy.problem09;

public class MeleeSwordAttack implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Swings steel greatsword dealing 45 slashing damage!");
    }
}
