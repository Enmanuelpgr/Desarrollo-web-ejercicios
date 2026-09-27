abstract class Fighter {
    boolean isVulnerable() {
        return false;
    }
    abstract int damagePoints(Fighter fighter);
}

class Warrior extends Fighter {
    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    int damagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }
}

class Wizard extends Fighter {
    private boolean isSpellPrepared = false;

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    public void prepareSpell() {
        isSpellPrepared = true;
    }

    @Override
    boolean isVulnerable() {
        return !isSpellPrepared;
    }

    @Override
    int damagePoints(Fighter fighter) {
        return isSpellPrepared ? 12 : 3;
    }
}

public class WizardsAndWarriors {
    public static void main(String[] args) {
        System.out.println("Probando Wizards and Warriors");
        Warrior warrior = new Warrior();
        Wizard wizard = new Wizard();
        
        System.out.println(warrior.toString());
        System.out.println(wizard.toString());
        
        System.out.println("Daño del guerrero al mago (mago vulnerable): " + warrior.damagePoints(wizard));
        
        wizard.prepareSpell();
        System.out.println("El mago prepara un hechizo...");
        
        System.out.println("Daño del mago al guerrero: " + wizard.damagePoints(warrior));
        System.out.println("Daño del guerrero al mago (mago protegido): " + warrior.damagePoints(wizard));
    }
}
