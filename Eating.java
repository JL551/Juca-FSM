public class Eating extends AbstractState {

    public Eating(Juca juca) {
        super(juca);
    }

    @Override
    public void enter() {
        System.out.println("Bateu uma fome...");
    }

    @Override
    public void execute() {
        juca.setHunger(juca.getHunger() - 5);

        System.out.println("Comendo...");
        System.out.println("Fome: " + juca.getHunger());
        System.out.println("Cansaço: " + juca.getFatigue());

        if (juca.getHunger() <= 0) {
            juca.setHunger(0);

            System.out.println("Ufa! Já estou cheio...");

            juca.changeState(new Working(juca));
        }
    }

    @Override
    public void leave() {
    }
}
