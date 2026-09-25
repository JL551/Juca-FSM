public class Sleeping extends AbstractState {

    public Sleeping(Juca juca) {
        super(juca);
    }

    @Override
    public void enter() {
        System.out.println("Bateu um sono...");
    }

    @Override
    public void execute() {
        juca.setHunger(juca.getHunger() + 1);
        juca.setFatigue(juca.getFatigue() - 10);

        System.out.println("Dormindo...");
        System.out.println("Fome: " + juca.getHunger());
        System.out.println("Cansaço: " + juca.getFatigue());

        if (juca.getFatigue() <= 0) {
            juca.setFatigue(0);

            if (juca.getHunger() <= 10) {
                juca.changeState(new Working(juca));
            } else {
                juca.changeState(new Eating(juca));
            }
        }
    }

    @Override
    public void leave() {
    }
}
